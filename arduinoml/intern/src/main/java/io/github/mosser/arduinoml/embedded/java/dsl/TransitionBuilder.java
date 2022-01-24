package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;

public class TransitionBuilder {

    private TransitionTableBuilder parent;

    private Transition local;

    private String source;

    TransitionBuilder(TransitionTableBuilder parent, String source) {
        this.source = source;
        this.parent = parent;
        this.local = new Transition();

    }

    public TransitionBuilder when(String sensor) {
        local.setSensor(parent.findSensor(sensor));
        return this;
    }

    public TemporalTransitionBuilder after(long duration){
        return new TemporalTransitionBuilder(this.parent, this.source,duration);
    }


    public MultipleTriggerTransitionBuilder and(String sensor) {
        return new MultipleTriggerTransitionBuilder(this.parent, this.source, "and", this.local.getSensor(),
                parent.findSensor(sensor));
    }

    public MultipleTriggerTransitionBuilder or(String sensor) {
        return new MultipleTriggerTransitionBuilder(this.parent, this.source, "or", this.local.getSensor(),
                parent.findSensor(sensor));
    }

    public TransitionBuilder isHigh() {
        local.setValue(SIGNAL.HIGH);
        return this;
    }

    public TransitionBuilder isLow() {
        local.setValue(SIGNAL.LOW);
        return this;
    }

    public TransitionTableBuilder goTo(String state) {
        this.parent.findState(this.source).addTransition(local);
        local.setNext(parent.findState(state));
        return parent;
    }

}
