package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

public class TemporalTransition implements Visitable {

    private final State next;
    private final long after;
    private final long number;

    public TemporalTransition(State next, long after, long number) {
        this.next = next;
        this.after = after;
        this.number = number;
    }

    public State getNext() {
        return next;
    }

    public long getNumber() {
        return number;
    }

    public long getAfter() {
        return after;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
