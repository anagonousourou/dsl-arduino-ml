package io.github.mosser.arduinoml.embedded.java.dsl;

import java.util.Map;

import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

public class TransitionTableBuilder {

    private AppBuilder parent;
    private Map<String, State> states;
    private Map<String, Sensor> sensors;

    TransitionTableBuilder(AppBuilder parent, Map<String, State> states, Map<String, Sensor> sensors) {
        this.parent = parent;
        this.states = states;
        this.sensors = sensors;
    }

    public TransitionBuilder from(String state) {
        return new TransitionBuilder(this, state);
    }


    public AppBuilder endTransitionTable() {
        return parent;
    }


    Sensor findSensor(String sensorName) {
        Sensor s = sensors.get(sensorName);
        if (s == null)
            throw new IllegalArgumentException("Unknown sensor: [" + sensorName + "]");
        return s;
    }

    State findState(String stateName) {
        State s = states.get(stateName);
        if (s == null)
            throw new IllegalArgumentException("Unknown state: ["+stateName+"]");
        return s;
    }


}
