package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;

public class ExceptionStateBuilder {
    private String name;
    private AppBuilder parent;

    public ExceptionStateBuilder(AppBuilder parent, String name) {
        this.name = name;
        this.parent = parent;
    }

    public AppBuilder withCode(int exceptionCode) {
        this.parent.theApp.getExceptionStates().add(new ExceptionState(this.name, exceptionCode));
        return parent;
    }

}
