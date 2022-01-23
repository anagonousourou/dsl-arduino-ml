import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

import static io.github.mosser.arduinoml.embedded.java.dsl.AppBuilder.*;

public class Main {

    public static void main (String[] args) {

        

        App myApp =
                application("red_button")
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

                /*
                # Declaring bricks
sensor button: 9
actuator led: 12
actuator buz: 11
# Declaring states
on {
    led <= HIGH
    buz <= HIGH
    button is LOW => off
}

-> off {
    led <= LOW
    buz <= LOW
    button is HIGH => on
}*/

//use multiple p

        App scenario1 = application("scenario1").uses(sensor("button", 9))
        .uses(actuator("led", 12)).uses(actuator("buz", 11)).hasForState("off").initial().setting("led").toLow().setting("buz").toLow().endState()
        .hasForState("on").setting("led").toHigh().setting("buz").toHigh().endState().beginTransitionTable()
        .from("on").when("button").isLow().goTo("off")
        .from("off").when("button").isHigh().goTo("on").endTransitionTable()
        .build();
        /*
        application redButton

# Declaring bricks
sensor button: 9
sensor button2: 4
actuator buz: 12

# Declaring states
state1 {
    buz <= LOW
    button2 or button is LOW => start
}

-> start {
    buz <= LOW
    button2 and button are HIGH => state1 
}
         */




        Visitor<StringBuffer> codeGenerator = new ToWiring();
        scenario1.accept(codeGenerator);
        System.out.println(codeGenerator.getResult());
        System.out.println("=============================");
    }

}
