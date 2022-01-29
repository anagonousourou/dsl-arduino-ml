package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public class ConditionBuilder {
    private TransitionBuilder transitionBuilder;
    private TransitionCondition transitionCondition = new TransitionCondition();

    public ConditionBuilder(TransitionBuilder transitionBuilder, Sensor sensor) {
        this.transitionBuilder = transitionBuilder;
        this.transitionCondition.addSensor(sensor);
    }

    public TransitionBuilder isHigh() {
        this.transitionCondition.setValue(SIGNAL.HIGH);
        this.transitionBuilder.local.setTransitionCondition(this.transitionCondition);
        return this.transitionBuilder;
    }

    public TransitionBuilder isLow() {
        this.transitionCondition.setValue(SIGNAL.LOW);
        this.transitionBuilder.local.setTransitionCondition(this.transitionCondition);
        return this.transitionBuilder;
    }

    public TransitionBuilder areHigh() {
        return this.isHigh();
    }

    public ConditionBuilder and(String sensor) {
        this.transitionCondition.setOperator("and");
        this.transitionCondition.addSensor(this.transitionBuilder.findSensor(sensor));
        return this;
    }

    public ConditionBuilder or(String sensor) {
        this.transitionCondition.setOperator("or");
        this.transitionCondition.addSensor(this.transitionBuilder.findSensor(sensor));
        return this;
    }

}
