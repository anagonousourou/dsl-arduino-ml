App simpleAlarm = application("scenario1").uses(sensor("button").atPin(9)).uses(actuator("led").atPin(12)).
                uses(actuator("buz").atPin(11)).
                hasForState("off").initial().setting("led").toLow().
                setting("buz").toLow().endState().
                hasForState("on").setting("led").toHigh().setting("buz").toHigh().endState().
                beginTransitionTable().
                from("on").when("button").isLow().goTo("off").
                from("off").when("button").isHigh().goTo("on").endTransitionTable().
                build();

var codeGenerator = new ToWiring()
simpleAlarm.accept(codeGenerator)
println(codeGenerator.getResult())
/exit