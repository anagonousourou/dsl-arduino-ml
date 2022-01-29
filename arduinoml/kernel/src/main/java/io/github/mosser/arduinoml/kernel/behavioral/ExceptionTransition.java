package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public class ExceptionTransition implements Visitable {
    private ExceptionState next;
    private TransitionCondition transitionCondition;

    

    public ExceptionTransition() {
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public ExceptionTransition(ExceptionState next, TransitionCondition transitionCondition) {
        this.next = next;
        this.transitionCondition = transitionCondition;
    }

    public ExceptionState getNext() {
        return next;
    }

    public void setNext(ExceptionState next) {
        this.next = next;
    }

    public TransitionCondition getTransitionCondition() {
        return transitionCondition;
    }

    public void setTransitionCondition(TransitionCondition transitionCondition) {
        this.transitionCondition = transitionCondition;
    }


}
