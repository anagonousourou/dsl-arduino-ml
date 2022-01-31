package io.github.mosser.arduinoml.externals.antlr;

import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlBaseListener;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.AndConditionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.ConditionTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.ExceptionDeclarationContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.ExceptionTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.OrConditionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.TemporalTransitionContext;
import io.github.mosser.arduinoml.externals.antlr.grammar.ArduinomlParser.UniqConditionContext;
import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.Action;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.TemporalTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ModelBuilder extends ArduinomlBaseListener {

    /********************
     ** Business Logic **
     ********************/

    private App theApp = null;
    private boolean built = false;

    private long temporalTransitionCounts = 0;
    /*******************
     ** Symbol tables **
     *******************/

    private Map<String, Sensor> sensors = new HashMap<>();
    private Map<String, Actuator> actuators = new HashMap<>();
    private Map<String, State> states = new HashMap<>();
    private Map<String, TemporalTransitionBinding> temporalBindings = new HashMap<>();
    private Map<String, ExceptionState> exceptionStates = new HashMap<>();
    private List<UnfinishedTransitionBinding> unfinishedTransitionBinding = new ArrayList<>();
    private Transition currentTransition;
    private State currentState = null;
    private ExceptionTransition exceptionTransition = null;

    public App retrieve() {
        if (built) {
            return theApp;
        }
        throw new RuntimeException("Cannot retrieve a model that was not created!");
    }

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

        states.forEach((stateName, state) -> {
            this.unfinishedTransitionBinding.stream().filter(unt -> unt.from.equals(stateName)).map(unt -> {
                unt.unfinishedTransition.setNext(states.get(unt.to));
                return unt.unfinishedTransition;
            }).forEach(state::addTransition);
        });

        this.temporalBindings.forEach((fromState, transition) ->

        states.get(fromState)
                .addTemporalTransition(
                        new TemporalTransition(states.get(transition.to), transition.after, transition.number)));

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
        // lcdScreen.setPin(Integer.parseInt(ctx.location().port.getText()));
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

        if (actuators.get(ctx.receiver.getText()) == null) {
            System.err.println("Undeclared actuator " + ctx.receiver.getText() + ". Compilation failed");
            System.exit(1);
        } else {
            Action action = new Action();
            action.setActuator(actuators.get(ctx.receiver.getText()));
            action.setValue(SIGNAL.valueOf(ctx.value.getText()));
            currentState.getActions().add(action);
        }

    }

    @Override
    public void enterPrint(ArduinomlParser.PrintContext ctx) {

        if (actuators.get(ctx.receiver.getText()) == null) {
            System.err.println("Undeclared printer " + ctx.receiver.getText() + ". Compilation failed");
            System.exit(1);
        } else {
            Print print = new Print();
            print.setActuator(actuators.get(ctx.receiver.getText()));
            if (ctx.value.getText().contains("\""))
                print.printString(ctx.value.getText());
            else{
                print.printBrick(actuators.containsKey(ctx.value.getText()) ? actuators.get(ctx.value.getText())
                        : sensors.get(ctx.value.getText()));
            }
            currentState.getActions().add(print);
        }
    }

    @Override
    public void enterConditionTransition(ConditionTransitionContext ctx) {

        this.currentTransition = new Transition();
        // this.currentTransition.setNext();
    }

    @Override
    public void exitConditionTransition(ConditionTransitionContext ctx) {
        UnfinishedTransitionBinding tmp = new UnfinishedTransitionBinding();
        tmp.from = this.currentState.getName();
        tmp.to = ctx.next.getText();
        tmp.unfinishedTransition = this.currentTransition;
        this.unfinishedTransitionBinding.add(tmp);

        this.currentTransition = null;
    }

    @Override
    public void enterAndCondition(AndConditionContext ctx) {

        TransitionCondition transitionCondition = new TransitionCondition();
        transitionCondition.addSensor(sensors.get(ctx.trigger1.getText()));
        transitionCondition.addSensor(sensors.get(ctx.trigger2.getText()));
        transitionCondition.setOperator("and");
        transitionCondition.setValue(SIGNAL.valueOf(ctx.value.getText()));

        if (this.exceptionTransition != null) {
            this.exceptionTransition.setTransitionCondition(transitionCondition);

        } else if (this.currentTransition != null) {
            this.currentTransition.setTransitionCondition(transitionCondition);
        }
    }

    @Override
    public void enterOrCondition(OrConditionContext ctx) {

        TransitionCondition transitionCondition = new TransitionCondition();
        transitionCondition.addSensor(sensors.get(ctx.trigger1.getText()));
        transitionCondition.addSensor(sensors.get(ctx.trigger2.getText()));
        transitionCondition.setOperator("or");
        transitionCondition.setValue(SIGNAL.valueOf(ctx.value.getText()));
        if (this.exceptionTransition != null) {
            this.exceptionTransition.setTransitionCondition(transitionCondition);

        } else if (this.currentTransition != null) {
            this.currentTransition.setTransitionCondition(transitionCondition);
        }
    }

    @Override
    public void enterUniqCondition(UniqConditionContext ctx) {
        TransitionCondition transitionCondition = new TransitionCondition();
        transitionCondition.addSensor(sensors.get(ctx.trigger.getText()));
        transitionCondition.setValue(SIGNAL.valueOf(ctx.value.getText()));
        if (this.exceptionTransition != null) {
            this.exceptionTransition.setTransitionCondition(transitionCondition);

        } else if (this.currentTransition != null) {
            this.currentTransition.setTransitionCondition(transitionCondition);
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
    public void enterInitial(ArduinomlParser.InitialContext ctx) {
        this.theApp.setInitial(this.currentState);
    }

    @Override
    public void enterExceptionDeclaration(ExceptionDeclarationContext ctx) {
        ExceptionState tmp = new ExceptionState(ctx.name.getText(), Integer.parseInt(ctx.code.getText()));
        this.exceptionStates.put(ctx.name.getText(), tmp);
        this.theApp.addExceptionState(tmp);
    }

    @Override
    public void enterExceptionTransition(ExceptionTransitionContext ctx) {
        this.exceptionTransition = new ExceptionTransition();
        this.exceptionTransition.setNext(this.exceptionStates.get(ctx.next.getText()));
    }

    @Override
    public void exitExceptionTransition(ExceptionTransitionContext ctx) {
        this.currentState.addExceptionTransition(this.exceptionTransition);
        this.exceptionTransition = null; // to leave an exception handling
    }

    private static class UnfinishedTransitionBinding {
        String from;
        Transition unfinishedTransition;
        String to; // name of the next state, as its instance might not have been compiled yet
    }

    private static class TemporalTransitionBinding {
        String to;
        long after;
        long number;
    }

}
