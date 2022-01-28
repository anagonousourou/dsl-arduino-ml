package io.github.mosser.arduinoml.externals.antlr;

import java.util.HashMap;
import java.util.Map;

import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlBaseListener;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.ConjunctionTriggerTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.DisjunctionTriggerTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.TemporalTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.TriggerTransitionContext;
import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class ModelBuilder extends ArduinomlBaseListener {

    /********************
     ** Business Logic **
     ********************/

    private App theApp = null;
    private boolean built = false;

    private long temporalTransitionCounts = 0;

    public App retrieve() {
        if (built) {
            return theApp;
        }
        throw new RuntimeException("Cannot retrieve a model that was not created!");
    }

    /*******************
     ** Symbol tables **
     *******************/

    private Map<String, Sensor> sensors = new HashMap<>();
    private Map<String, Actuator> actuators = new HashMap<>();
    private Map<String, State> states = new HashMap<>();
    private Map<String, Binding> bindings = new HashMap<>();
    private Map<String, TemporalTransitionBinding> temporalBindings = new HashMap<>();
    private Map<String, MultipleTriggersTransitionBinding> conjunctionBindings = new HashMap<>();

    private class Binding { // used to support state resolution for transitions
        String to; // name of the next state, as its instance might not have been compiled yet
        Sensor trigger;
        SIGNAL value;
    }

    private static class MultipleTriggersTransitionBinding {
        String operator;
        Sensor trigger1;
        Sensor trigger2;
        String to; // name of the next state, as its instance might not have been compiled yet
        SIGNAL value;
    }

    private static class TemporalTransitionBinding {
        String to;
        long after;
        long number;
    }

    private State currentState = null;

    /**************************
     ** Listening mechanisms **
     **************************/

    @Override
    public void enterRoot(ArduinomlParser.RootContext ctx) {
        built = false;
        theApp = new App();
    }

    @Override
    public void exitRoot(ArduinomlParser.RootContext ctx) {
        // Resolving states in transitions

        bindings.forEach((key, binding) -> {
            Transition t = new Transition();
            t.setSensor(binding.trigger);
            t.setValue(binding.value);
            t.setNext(states.get(binding.to));
            states.get(key).addTransition(t);
        });

        this.temporalBindings.forEach((fromState, transition) ->

        states.get(fromState)
                .addTemporalTransition(
                        new TemporalTransition(states.get(transition.to), transition.after, transition.number)));

        this.conjunctionBindings.forEach((fromState, binding) -> states.get(fromState)
                .addMultipleConditionTransition(new MultipleConditionTransition(states.get(binding.to),
                        binding.trigger1, binding.trigger2, binding.value, binding.operator)));

        this.built = true;
    }

    @Override
    public void enterDeclaration(ArduinomlParser.DeclarationContext ctx) {
        theApp.setName(ctx.name.getText());
    }

    @Override
    public void enterSensor(ArduinomlParser.SensorContext ctx) {
        Sensor sensor = new Sensor();
        sensor.setName(ctx.location().id.getText());
        sensor.setPin(Integer.parseInt(ctx.location().port.getText()));
        this.theApp.getBricks().add(sensor);
        sensors.put(sensor.getName(), sensor);
    }

    @Override
    public void enterActuator(ArduinomlParser.ActuatorContext ctx) {
        Actuator actuator = new Actuator();
        actuator.setName(ctx.location().id.getText());
        actuator.setPin(Integer.parseInt(ctx.location().port.getText()));
        this.theApp.getBricks().add(actuator);
        actuators.put(actuator.getName(), actuator);
    }

    @Override
    public void enterPrinter(ArduinomlParser.PrinterContext ctx) {
        LCDScreen lcdScreen = new LCDScreen();
        lcdScreen.setName(ctx.id.getText());
        //lcdScreen.setPin(Integer.parseInt(ctx.location().port.getText()));
        this.theApp.getBricks().add(lcdScreen);
        actuators.put(lcdScreen.getName(), lcdScreen);
    }

    @Override
    public void enterState(ArduinomlParser.StateContext ctx) {
        State local = new State();
        local.setName(ctx.name.getText());
        this.currentState = local;
        this.states.put(local.getName(), local);
    }

    @Override
    public void exitState(ArduinomlParser.StateContext ctx) {
        this.theApp.getStates().add(this.currentState);
        this.currentState = null;
    }

    @Override
    public void enterAction(ArduinomlParser.ActionContext ctx) {

        if(actuators.get(ctx.receiver.getText())==null){
            System.err.println("Undeclared actuator "+ctx.receiver.getText()+". Compilation failed");
            System.exit(1);
        }
        else{
            Action action = new Action();
            action.setActuator(actuators.get(ctx.receiver.getText()));
            action.setValue(SIGNAL.valueOf(ctx.value.getText()));
            currentState.getActions().add(action);
        }

    }

    @Override
    public void enterPrint(ArduinomlParser.PrintContext ctx) {

        if(actuators.get(ctx.receiver.getText())==null){
            System.err.println("Undeclared printer "+ctx.receiver.getText()+". Compilation failed");
            System.exit(1);
        }
        else{
            Print print = new Print();
            print.setActuator(actuators.get(ctx.receiver.getText()));
            print.setValue(ctx.value.getText().substring(1,ctx.value.getText().length()-1));
            currentState.getActions().add(print);
        }

    }

    @Override
    public void enterTemporalTransition(TemporalTransitionContext ctx) {
        this.temporalTransitionCounts++;
        TemporalTransitionBinding binding = new TemporalTransitionBinding();
        binding.after = Long.parseLong(ctx.duration.getText());
        binding.to = ctx.next.getText();
        binding.number = this.temporalTransitionCounts;

        temporalBindings.put(currentState.getName(), binding);
    }

    @Override
    public void enterTriggerTransition(TriggerTransitionContext ctx) {
        // Creating a placeholder as the next state might not have been compiled yet.
        Binding toBeResolvedLater = new Binding();
        toBeResolvedLater.to = ctx.next.getText();
        toBeResolvedLater.trigger = sensors.get(ctx.trigger.getText());
        toBeResolvedLater.value = SIGNAL.valueOf(ctx.value.getText());
        bindings.put(this.currentState.getName(), toBeResolvedLater);// TODO the map means that only one transition is
                                                                     // available by state
    }

    @Override
    public void enterInitial(ArduinomlParser.InitialContext ctx) {
        this.theApp.setInitial(this.currentState);
    }

    @Override
    public void enterConjunctionTriggerTransition(ConjunctionTriggerTransitionContext ctx) {
        MultipleTriggersTransitionBinding binding = new MultipleTriggersTransitionBinding();
        binding.operator = "and";
        binding.to = ctx.next.getText();
        binding.trigger1 = sensors.get(ctx.trigger1.getText());
        binding.trigger2 = sensors.get(ctx.trigger2.getText());
        binding.value = SIGNAL.valueOf(ctx.value.getText());

        this.conjunctionBindings.put(this.currentState.getName(), binding);
    }

    @Override
    public void enterDisjunctionTriggerTransition(DisjunctionTriggerTransitionContext ctx) {
        MultipleTriggersTransitionBinding binding = new MultipleTriggersTransitionBinding();
        binding.operator = "or";
        binding.to = ctx.next.getText();
        binding.trigger1 = sensors.get(ctx.trigger1.getText());
        binding.trigger2 = sensors.get(ctx.trigger2.getText());
        binding.value = SIGNAL.valueOf(ctx.value.getText());

        this.conjunctionBindings.put(this.currentState.getName(), binding);
    }

}
