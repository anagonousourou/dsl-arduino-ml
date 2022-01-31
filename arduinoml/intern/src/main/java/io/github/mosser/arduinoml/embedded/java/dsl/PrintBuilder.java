package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.structural.Brick;

public class PrintBuilder extends Print {

    private final StateBuilder stateBuilder;

    public PrintBuilder(StateBuilder stateBuilder) {
        this.stateBuilder = stateBuilder;
        this.stateBuilder.parent.build().setMustPrintWithLcd(true);
    }

    public PrintBuilder printABrick(Brick brick) {
        super.printBrick(brick);
        return this;
    }

    public PrintBuilder printAString(String s) {
        super.printString(s);
        return this;
    }

    public StateBuilder endPrinting(){
        stateBuilder.local.getActions().add(this);
        return stateBuilder;
    }

}
