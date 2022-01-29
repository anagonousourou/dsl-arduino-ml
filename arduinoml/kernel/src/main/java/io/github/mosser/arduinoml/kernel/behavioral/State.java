package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.NamedElement;
import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

import java.util.ArrayList;
import java.util.List;

public class State implements NamedElement, Visitable {

    private String name;
    private List<Action> actions = new ArrayList<>();
    private List<Transition> transitions = new ArrayList<>();
    private List<ExceptionTransition> exceptionTransitions = new ArrayList<>();
    private List<TemporalTransition> temporalTransitions = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<ExceptionTransition> getExceptionTransitions() {
        return exceptionTransitions;
    }

    public void addExceptionTransition(ExceptionTransition transition) {
        this.exceptionTransitions.add(transition);
    }

    public List<TemporalTransition> getTemporalTransitions() {
        if (this.temporalTransitions == null) {
            return new ArrayList<>();
        }
        return temporalTransitions;
    }

    public void addTemporalTransition(TemporalTransition temporalTransition) {
        if (this.temporalTransitions == null) {
            this.temporalTransitions = new ArrayList<>();
        }
        this.temporalTransitions.add(temporalTransition);
    }

    public List<Transition> getTransitions() {
        if (this.transitions == null) {
            return new ArrayList<>();
        }
        return transitions;
    }

    public void addTransition(Transition transition) {
        if (this.transitions == null) {
            this.transitions = new ArrayList<>();
        }
        this.transitions.add(transition);

    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "State [name=" + name + "]";
    }

}
