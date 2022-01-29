package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class TransitionBuilder {

    Transition local;
    private TransitionTableBuilder parent;
    private String source;

    TransitionBuilder(TransitionTableBuilder parent, String source) {
        this.source = source;
        this.parent = parent;
        this.local = new Transition();

    }

    public ConditionBuilder when(String sensor) {

        return new ConditionBuilder(this, parent.findSensor(sensor));
    }

    public TemporalTransitionBuilder after(long duration) {
        return new TemporalTransitionBuilder(this.parent, this.source, duration);
    }

    public TransitionTableBuilder raise(String state){
        ExceptionState exceptionState = parent.findExceptionState(state);
        this.parent.findState(this.source).addExceptionTransition(new ExceptionTransition(exceptionState,this.local.getTransitionCondition()));
        return parent;
    }

    public TransitionTableBuilder goTo(String state) {
        this.parent.findState(this.source).addTransition(local);
        local.setNext(parent.findState(state));
        return parent;
    }
    

    Sensor findSensor(String sensorName) {
        return this.parent.findSensor(sensorName);
    }


}
