import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.*;

public class Main {

    public static void main(String[] args) {

        App myApp = application("red_button")
                .uses(sensor("button", 9))
                .uses(actuator("led", 12))
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

        App scenario1 = application("scenario1").uses(sensor("button", 9)).uses(actuator("led", 12))
                .uses(actuator("buz", 11))
                .hasForState("off").initial().setting("led").toLow()
                .setting("buz").toLow().endState()
                .hasForState("on").setting("led").toHigh().setting("buz").toHigh().endState().beginTransitionTable()
                .from("on").when("button").isLow().goTo("off")

                .from("off").when("button").isHigh().goTo("on").endTransitionTable()
                .build();

        App scenario2 = application("scenario2").uses(sensor("button", 9)).uses(sensor("button2", 4))
                .uses(actuator("buz", 12))
                .hasForState("start").initial().setting("buz").toLow().endState()
                .hasForState("state1").setting("buz").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").and("button2").areHigh().goTo("state1")
                .from("state1").when("button").or("button2").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App scenario3 = application("scenario3").uses(sensor("button", 9)).uses(actuator("led1", 12))
                .hasForState("start").initial().setting("led1").toLow().endState()
                .hasForState("state1").setting("led1").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").when("button").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App scenario4 = application("scenario4").uses(sensor("button", 9)).uses(actuator("led", 12))
                .uses(actuator("buz", 12))
                .hasForState("start").initial().setting("led").toLow().setting("buz").toLow().endState()
                .hasForState("state1").setting("buz").toHigh().endState()
                .hasForState("state2").setting("buz").toHigh().setting("led").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").when("button").isHigh().goTo("state2")
                .from("state2").when("button").isHigh().goTo("start")
                .endTransitionTable()
                .build();

        App temporalTransitionScenario1 = application("temporalTransitionScenario1").uses(sensor("button", 9))
                .uses(actuator("led", 12))
                .hasForState("start").initial().setting("led").toLow().endState()
                .hasForState("state1").setting("led").toHigh().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").after(800).milliseconds().goTo("state1")
                .endTransitionTable()
                .build();

        App temporalTransitionScenario2 = application("temporalTransitionScenario2")
                .uses(sensor("button", 9)).uses(actuator("led", 12)).uses(actuator("buz", 4))
                .hasForState("start").initial().setting("led").toLow().setting("buz").toLow().endState()
                .hasForState("state1").setting("led").toHigh().endState()
                .hasForState("state2").setting("buz").toHigh().setting("led").toLow().endState()
                .beginTransitionTable()
                .from("start").when("button").isHigh().goTo("state1")
                .from("state1").after(3).seconds().goTo("state2")
                .from("state2").after(2).seconds().goTo("start")
                .endTransitionTable()
                .build();

        Visitor<StringBuffer> codeGenerator = new ToWiring();

        myApp.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        scenario1.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        scenario2.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");
        
        scenario3.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        scenario4.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        temporalTransitionScenario1.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");

        temporalTransitionScenario2.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");
    }


}
