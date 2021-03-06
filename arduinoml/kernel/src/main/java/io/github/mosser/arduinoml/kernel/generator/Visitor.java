package io.github.mosser.arduinoml.kernel.generator;

import java.util.HashMap;
import java.util.Map;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.DigitalAction;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.TemporalTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public abstract class Visitor<T> {

    /***********************
     ** Helper mechanisms **
     ***********************/


    public abstract void visit(Print print);


    public abstract void visit(LCDScreen lcdScreen);


    protected Map<String, Object> context = new HashMap<>();
    protected T result;

    public abstract void visit(App app);

    public abstract void visit(State state);

    public abstract void visit(Transition transition);

    public abstract void visit(DigitalAction action);

    public abstract void visit(Actuator actuator);

    public abstract void visit(Sensor sensor);

    public abstract void visit(TemporalTransition transition);

    public abstract void visit(TransitionCondition transitionCondition);

    public T getResult() {
        return result;
    }

    public abstract void visit(ExceptionTransition exceptionTransition);

    public abstract void visit(ExceptionState exceptionState);


}

