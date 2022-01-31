package io.github.mosser.arduinoml.embedded.java.dsl;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.Brick;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.Sensor;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppBuilder {

    App theApp = null;

    private AppBuilder() {
    }

    /*********************
     ** Creating an App **
     *********************/

    public static AppBuilder application(String name) {
        AppBuilder inst = new AppBuilder();
        inst.theApp = new App();
        inst.theApp.setName(name);
        return inst;
    }

    public static BrickBuilder actuator(String name) {
        return new BrickBuilder(Actuator.class, name);
    }

    public static BrickBuilder sensor(String name) {
        return new BrickBuilder(Sensor.class, name);
    }

    public static Brick lcd(String name) {
        return new BrickBuilder(LCDScreen.class, name).createBrick();
    }

    static Brick createBrick(Class<? extends Brick> kind, String name, int port) {
        try {
            Brick b = kind.newInstance();
            if (name.isEmpty() || !Character.isLowerCase(name.charAt(0)))
                throw new IllegalArgumentException("Illegal brick name: [" + name + "]");
            b.setName(name);
            if (port < 1 || port > 12)
                throw new IllegalArgumentException("Illegal brick port: [" + port + "]");
            b.setPin(port);
            return b;
        } catch (InstantiationException | IllegalAccessException iae) {
            throw new IllegalArgumentException("Unable to instantiate " + kind.getCanonicalName());
        }
    }

    static Brick createBrick(Class<? extends Brick> kind, String name) {
        try {
            Brick b = kind.newInstance();
            if (name.isEmpty() || !Character.isLowerCase(name.charAt(0)))
                throw new IllegalArgumentException("Illegal brick name: [" + name + "]");
            b.setName(name);
            return b;
        } catch (InstantiationException | IllegalAccessException iae) {
            throw new IllegalArgumentException("Unable to instantiate " + kind.getCanonicalName());
        }
    }

    public App build() {
        return theApp;
    }

    public ExceptionStateBuilder hasException(String exceptionName) {
        return new ExceptionStateBuilder(this, exceptionName);
    }

    /**********************
     ** Declaring Bricks **
     **********************/

    public AppBuilder uses(Brick b) {
        this.theApp.getBricks().add(b);
        return this;
    }

    /**********************
     ** Declaring States **
     **********************/

    public StateBuilder hasForState(String name) {
        return new StateBuilder(this, name);
    }


    /*******************************
     ** Declaring TransitionTable **
     *******************************/

    public TransitionTableBuilder beginTransitionTable() {

        Map<String, State> stateTable = theApp.getStates().stream()
                .collect(Collectors.toMap(State::getName, Function.identity()));

        Map<String, ExceptionState> exceptionStateTable = theApp.getExceptionStates().stream()
                .collect(Collectors.toMap(ExceptionState::getName, Function.identity()));

        Map<String, Sensor> sensorTable = theApp.getBricks().stream()
                .filter(Sensor.class::isInstance)
                .map(Sensor.class::cast)
                .collect(Collectors.toMap(Brick::getName, Function.identity()));

        return new TransitionTableBuilder(this, stateTable, sensorTable, exceptionStateTable);
    }

    /***********************************************************************************
     ** Helpers to avoid a symbol table for Bricks (using the App under construction)
     * **
     ***********************************************************************************/

    Optional<Actuator> findActuator(String name) {
        Optional<Brick> b = theApp.getBricks()
                .stream()
                .filter(Actuator.class::isInstance)
                .filter(actuator -> actuator.getName().equals(name))
                .findFirst();
        return b.map(sensor -> Optional.of((Actuator) sensor)).orElse(Optional.empty());
    }

}
