package io.github.mosser.arduinoml.kernel;

import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.Brick;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class App implements NamedElement, Visitable {

    private String name;
    private List<Brick> bricks = new ArrayList<>();
    private List<State> states = new ArrayList<>();
    private List<ExceptionState> exceptionStates = new ArrayList<>();
    private State initial;

    private List<String> errors = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }

    public State getInitial() {
        return initial;
    }

    public void setInitial(State initial) {
        this.initial = initial;
    }

    public void addExceptionState(ExceptionState exceptionState) {
        this.exceptionStates.add(exceptionState);
    }

    public List<ExceptionState> getExceptionStates() {
        return exceptionStates;
    }

    @Override
    public void accept(Visitor visitor) {
        this.validate();
        if (this.errors.isEmpty()) {
            visitor.visit(this);
        } else {
            System.err.println("The following errors occured:");
            this.errors.forEach(System.err::println);
            System.exit(1);
        }

    }

    private void validate() {
        // bricks declared two times
        int uniqBricksCount = this.bricks.stream().map(Brick::getName).collect(Collectors.toSet()).size();

        List<String> bricksName = new ArrayList<>(
                this.bricks.stream().map(Brick::getName).collect(Collectors.toList()));

        Map<String, Integer> map = new HashMap<>();
        bricksName.forEach(d -> map.put(d, map.containsKey(d) ? map.get(d) + 1 : 1));

        if (uniqBricksCount != this.bricks.size()) {
            this.errors.add("The following bricks are declared more than once: " + map.entrySet().stream()
                    .filter(entry -> entry.getValue() > 1).map(Entry::getKey).collect(Collectors.toList()));
        }

        // two bricks can't be on the same pin

        Set<String> bricksdone = new HashSet<>();

        for (Brick brick1 : this.bricks) {
            for (Brick brick2 : this.bricks) {
                if (!brick1.getName().equals(brick2.getName()) && brick1.getPin() == brick2.getPin()
                        && !bricksdone.contains(brick2.getName())) {
                    this.errors.add(
                            String.format("Use of same pin n°%d with %s and %s.", brick1.getPin(), brick1.getName(),
                                    brick2.getName()));
                }
            }
            bricksdone.add(brick1.getName());
        }

        // detect if exception handling is used in the program

        if (!this.exceptionStates.isEmpty()) {
            for (Brick brick1 : this.bricks) {
                if (brick1.getPin() == 12) {
                    this.errors.add(
                            "Use of pin n°12 is forbidden when using exception handling. It is reserved for displaying the exception");
                    break;
                }
            }
            this.bricks.add(new Actuator("exceptionLed", 12));
        }

    }
}
