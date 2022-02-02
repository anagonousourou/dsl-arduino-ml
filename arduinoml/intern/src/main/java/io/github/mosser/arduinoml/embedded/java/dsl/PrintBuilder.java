package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.structural.Brick;

public class PrintBuilder {

    private Print printAction;
    private final StateBuilder stateBuilder;

    public PrintBuilder(StateBuilder stateBuilder) {
        this.stateBuilder = stateBuilder;
        this.stateBuilder.parent.build().setMustPrintWithLcd(true);
        this.printAction = new Print();
    }

    private PrintBuilder printABrick(String s) {
        for (Brick b : stateBuilder.parent.theApp.getBricks()) {
            if (b.getName().equals(s)) {
                this.printAction.printBrick(b);
                return this;
            }
        }
        return null;
    }

    PrintBuilder display(String... toprints) {
        for (String s : toprints) {
            if (s.startsWith("$")) {
                this.printABrick(s.substring(1));
            } else {
                this.printAString(s);
            }
        }

        return this;
    }


    private PrintBuilder printAString(String s) {
        this.printAction.printString('"' + s + '"');
        return this;
    }

    public StateBuilder to(String lcdName) {
        stateBuilder.local.getActions().add(this.printAction);
        return stateBuilder;
    }

}
