App stateBasedAlarm = application("scenario3").uses(sensor("button").atPin(9)).
                uses(actuator("led1").atPin(12)).
                hasForState("start").initial().setting("led1").toLow().endState().
                hasForState("state1").setting("led1").toHigh().endState().
                beginTransitionTable().
                from("start").when("button").isHigh().goTo("state1").
                from("state1").when("button").isHigh().goTo("start").
                endTransitionTable().
                build()

var codeGenerator = new ToWiring()
stateBasedAlarm.accept(codeGenerator)
println(codeGenerator.getResult())

/exit