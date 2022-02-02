App dualCheckAlarm = application("scenario2").uses(sensor("button").atPin(9)).
                uses(sensor("button2").atPin(4)).
                uses(actuator("buz").atPin(12)).
                hasForState("start").initial().setting("buz").toLow().endState().
                hasForState("state1").setting("buz").toHigh().endState().
                beginTransitionTable().
                from("start").when("button").and("button2").areHigh().goTo("state1").
                from("state1").when("button").or("button2").isHigh().goTo("start").
                endTransitionTable().
                build()

var codeGenerator = new ToWiring()
dualCheckAlarm.accept(codeGenerator)
println(codeGenerator.getResult())
/exit