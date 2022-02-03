App temporalTransitionScenario1 = application("temporalTransitionScenario1").
                uses(sensor("button").atPin(9)).
                uses(actuator("led").atPin(12)).
                hasForState("start").initial().setting("led").toLow().endState().
                hasForState("state1").setting("led").toHigh().endState().
                beginTransitionTable().
                from("start").when("button").isHigh().goTo("state1").
                from("state1").after(800).milliseconds().goTo("state1").
                endTransitionTable().
                build()


var codeGenerator = new ToWiring()
temporalTransitionScenario1.accept(codeGenerator)
println(codeGenerator.getResult())
/exit