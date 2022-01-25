package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public class ExceptionTransition implements Visitable{
    private ExceptionState next;
	private TransitionCondition transitionCondition;
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        
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
