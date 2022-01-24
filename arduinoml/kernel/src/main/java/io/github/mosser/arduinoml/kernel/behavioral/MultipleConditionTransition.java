package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class MultipleConditionTransition implements Visitable {

    private final State next;
    private final Sensor sensor1;
    private final Sensor sensor2;
    private final SIGNAL value;
    private final String operator;

    public MultipleConditionTransition(State next, Sensor sensor1, Sensor sensor2, SIGNAL value, String operator) {
        this.next = next;
        this.sensor1 = sensor1;
        this.sensor2 = sensor2;
        this.value = value;
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public State getNext() {
        return next;
    }

    public Sensor getSensor1() {
        return sensor1;
    }

    public Sensor getSensor2() {
        return sensor2;
    }

    public SIGNAL getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
