package io.github.mosser.arduinoml.embedded.java.dsl;


import java.util.Optional;

import io.github.mosser.arduinoml.kernel.behavioral.DigitalAction;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;

public class InstructionBuilder {

    private StateBuilder parent;

    private DigitalAction local = new DigitalAction();

    InstructionBuilder(StateBuilder parent, String target) {
        this.parent = parent;
        Optional<Actuator> opt = parent.parent.findActuator(target);
        Actuator act = opt.orElseThrow(() -> new IllegalArgumentException("Illegal actuator: [" + target + "]"));
        local.setActuator(act);
    }

    public StateBuilder toHigh() {
        local.setValue(SIGNAL.HIGH);
        return goUp();
    }

    public StateBuilder toLow() {
        local.setValue(SIGNAL.LOW);
        return goUp();
    }

    private StateBuilder goUp() {
        parent.local.getActions().add(this.local);
        return parent;
    }

}
