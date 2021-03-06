import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.actuator;
import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.application;
import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.lcd;
import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.sensor;

public class Main {

    public static void main(String[] args) {

        App myApp = application("red_button")
                .uses(sensor("button").atPin(9))
                .uses(actuator("led").atPin(12))
                .hasForState("on")
                .setting("led").toHigh()
                .endState()
                .hasForState("off").initial()
                .setting("led").toLow()
                .endState()
                .beginTransitionTable()
                .from("on").when("button").isHigh().goTo("off")
                .from("off").when("button").isHigh().goTo("on")
                .endTransitionTable()
                .build();

        App simpleAlarm = application("scenario1").uses(sensor("button").atPin(9)).uses(actuator("led").atPin(12))
                .uses(actuator("buz").atPin(11))
                .hasForState("off").initial().setting("led").toLow()
                .setting("buz").toLow().endState()
                .hasForState("on").setting("led").toHigh().setting("buz").toHigh().endState()
                .beginTransitionTable()
                .from("on").when("button").isLow().goTo("off")
                .from("off").when("button").isHigh().goTo("on").endTransitionTable()
                .build();

        App dualCheckAlarm = application("scenario2").uses(sensor("button").atPin(9))
                .uses(sensor("button2").atPin(4))
                .uses(actuator("buz").atPin(12))
                .hasForState("start").initial().setting("buz").toLow().endState()
                .hasForState("state1").setting("buz").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").and("button2").areHigh().goTo("state1")
                .from("state1").when("button").or("button2").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App stateBasedAlarm = application("scenario3").uses(sensor("button").atPin(9))
                .uses(actuator("led1").atPin(12))
                .hasForState("start").initial().setting("led1").toLow().endState()
                .hasForState("state1").setting("led1").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").when("button").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App multiStateAlarm = application("scenario4").uses(sensor("button").atPin(9)).uses(actuator("led").atPin(11))
                .uses(actuator("buz").atPin(12))
                .hasForState("start").initial().setting("led").toLow().setting("buz").toLow().endState()
                .hasForState("state1").setting("buz").toHigh().endState()
                .hasForState("state2").setting("buz").toLow().setting("led").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").when("button").isHigh().goTo("state2")
                .from("state2").when("button").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App temporalTransitionScenario1 = application("temporalTransitionScenario1")
                .uses(sensor("button").atPin(9))
                .uses(actuator("led").atPin(12))
                .hasForState("start").initial().setting("led").toLow().endState()
                .hasForState("state1").setting("led").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").after(800).milliseconds().goTo("state1")
                .endTransitionTable()
                .build();

        App temporalTransitionScenario2 = application("temporalTransitionScenario2")
                .uses(sensor("button").atPin(9)).uses(actuator("led").atPin(12))
                .uses(actuator("buz").atPin(4))
                .hasForState("start").initial().setting("led").toLow().setting("buz").toLow().endState()
                .hasForState("state1").setting("led").toHigh().endState()
                .hasForState("state2").setting("buz").toHigh().setting("led").toLow().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").after(3).seconds().goTo("state2")
                .from("state2").after(2).seconds().goTo("start")
                .endTransitionTable()
                .build();

        App exceptionScenario = application("exceptionScenario")
                .uses(sensor("button").atPin(9)).uses(sensor("button2").atPin(10))
                .uses(actuator("buz").atPin(11))
                .hasException("doorViolation").withCode(3)
                .hasForState("goIn").setting("buz").toHigh().endState()
                .hasForState("getOut").setting("buz").toHigh().endState()
                .hasForState("start").initial().setting("buz").toLow().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("goIn")
                .from("start").when("button2").isHigh().goTo("getOut")
                .from("start").when("button").and("button2").areHigh().raise("doorViolation")
                .from("goIn").after(3).seconds().goTo("start")
                .from("getOut").after(3).seconds().goTo("start")
                .endTransitionTable()
                .build();

        App lcdDisplayScenario = application("lcdDisplayScenario").uses(sensor("button").atPin(9))
                .uses(actuator("led").atPin(11))
                .uses(actuator("buz").atPin(12))
                .uses(lcd("lcd"))
                .hasForState("start").initial()
                .setting("led").toLow()
                .setting("buz").toLow()
                .displaying("Start : ", "$button", " ", "$buz", " ", "$led").to("lcd")
                .endState()
                .hasForState("state1").setting("buz").toHigh()
                .displaying("State 1 : ", "$button", " ", "$buz", " ", "$led").to("lcd")
                .endState()
                .hasForState("state2").setting("buz").toLow().setting("led").toHigh()
                .displaying("State 2 : ", "$button", " ", "$buz", " ", "$led").to("lcd")
                .endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").when("button").isHigh().goTo("state2")
                .from("state2").when("button").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        Visitor<StringBuffer> codeGenerator = new ToWiring();

        myApp.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        simpleAlarm.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        dualCheckAlarm.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        stateBasedAlarm.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        multiStateAlarm.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        temporalTransitionScenario1.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        temporalTransitionScenario2.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        exceptionScenario.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        lcdDisplayScenario.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

    }

}
