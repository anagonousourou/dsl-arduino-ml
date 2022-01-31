package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.structural.Brick;

public class BrickBuilder {
    private String name;
    private Class<? extends Brick> brickClass;


    public BrickBuilder(Class<? extends Brick> brickClass, String name) {
        this.brickClass = brickClass;
        this.name = name;
    }


    public Brick atPin(int pin) {
        return AppBuilder.createBrick(this.brickClass, this.name, pin);
    }

    Brick createBrick() {
        return AppBuilder.createBrick(this.brickClass, this.name);
    }

}
