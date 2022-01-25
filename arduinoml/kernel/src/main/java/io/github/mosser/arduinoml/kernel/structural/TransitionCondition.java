package io.github.mosser.arduinoml.kernel.structural;

import java.util.ArrayList;
import java.util.List;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

public class TransitionCondition implements Visitable{
    private List<Sensor> sensors = new ArrayList<>();
	private SIGNAL value;
    private String operator;


    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public SIGNAL getValue() {
        return value;
    }
    public void setValue(SIGNAL value) {
        this.value = value;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        
    }

    public List<Sensor> getSensors() {
        return sensors;
    }
    public void addSensor(Sensor sensor) {
        this.sensors.add(sensor);
    }

    
}
