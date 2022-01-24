package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.MultipleConditionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class MultipleTriggerTransitionBuilder {
    private Sensor sensor1;
    private Sensor sensor2;
    private State next;

    private SIGNAL value;
    private String operator;
    private TransitionTableBuilder parent;
    private String sourceState;

    public MultipleTriggerTransitionBuilder(TransitionTableBuilder parent, String sourceState, String operator,
            Sensor trigger1, Sensor trigger2) {
        this.sourceState = sourceState;
        this.parent = parent;
        this.operator = operator;
        this.sensor1 = trigger1;
        this.sensor2 = trigger2;
    }

    public MultipleTriggerTransitionBuilder isHigh() {
        this.value = SIGNAL.HIGH;
        return this;
    }

    public MultipleTriggerTransitionBuilder areHigh() {
        return this.isHigh();
    }

    public MultipleTriggerTransitionBuilder isLow() {
        this.value = SIGNAL.LOW;
        return this;
    }

    public MultipleTriggerTransitionBuilder areLow() {
        return this.isLow();
    }

    public TransitionTableBuilder goTo(String state) {
        this.next = this.parent.findState(state);
        parent.findState(this.sourceState).addMultipleConditionTransition( new MultipleConditionTransition(this.next, this.sensor1, this.sensor2, this.value, this.operator) );
        return parent;
    }
}
