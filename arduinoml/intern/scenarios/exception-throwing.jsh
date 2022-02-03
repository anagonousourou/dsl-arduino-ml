App exceptionScenario = application("exceptionScenario").
                uses(sensor("button").atPin(9)).uses(sensor("button2").atPin(10)).
                uses(actuator("buz").atPin(11)).
                hasException("doorViolation").withCode(3).
                hasForState("goIn").setting("buz").toHigh().endState().
                hasForState("getOut").setting("buz").toHigh().endState().
                hasForState("start").initial().setting("buz").toLow().endState().
                beginTransitionTable().
                from("start").when("button").isHigh().goTo("goIn").
                from("start").when("button2").isHigh().goTo("getOut").
                from("start").when("button").and("button2").areHigh().raise("doorViolation").
                from("goIn").after(3).seconds().goTo("start").
                from("getOut").after(3).seconds().goTo("start").
                endTransitionTable().
                build()

var codeGenerator = new ToWiring()
exceptionScenario.accept(codeGenerator)
println(codeGenerator.getResult())
/exit