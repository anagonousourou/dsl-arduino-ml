package io.github.mosser.arduinoml.kernel.generator;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.Action;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.TemporalTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

import java.util.HashMap;
import java.util.Map;

public abstract class Visitor<T> {

    /***********************
     ** Helper mechanisms **
     ***********************/

    protected Map<String, Object> context = new HashMap<>();
    protected T result;

    public abstract void visit(App app);

    public abstract void visit(State state);

    public abstract void visit(Transition transition);

    public abstract void visit(Action action);

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

