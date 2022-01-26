package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public class Transition implements Visitable {

    private State next;
    private TransitionCondition transitionCondition;

    public State getNext() {
        return next;
    }

    public void setNext(State next) {
        this.next = next;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public TransitionCondition getTransitionCondition() {
        return transitionCondition;
    }

    public void setTransitionCondition(TransitionCondition transitionCondition) {
        this.transitionCondition = transitionCondition;
    }

    @Override
    public String toString() {
        return "Transition [next=" + next + ", transitionCondition=" + transitionCondition + "]";
    }


}
