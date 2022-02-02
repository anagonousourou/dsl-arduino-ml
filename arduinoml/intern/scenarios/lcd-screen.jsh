App lcdDisplayScenario = application("lcdDisplayScenario").uses(sensor("button").atPin(9)).
                uses(actuator("led").atPin(11)).uses(actuator("buz").atPin(12)).uses(lcd("lcd")).
                hasForState("start").initial().
                setting("led").toLow().
                setting("buz").toLow().
                displaying("Start : ", "$button", " ", "$buz", " ", "$led").to("lcd").
                endState().
                hasForState("state1").setting("buz").toHigh().
                displaying("State 1 : ", "$button", " ", "$buz", " ", "$led").to("lcd").
                endState().
                hasForState("state2").setting("buz").toLow().setting("led").toHigh().
                displaying("State 2 : ", "$button", " ", "$buz", " ", "$led").to("lcd").
                endState().
                beginTransitionTable().
                from("start").when("button").isHigh().goTo("state1").
                from("state1").when("button").isHigh().goTo("state2").
                from("state2").when("button").isHigh().goTo("start").
                endTransitionTable().
                build()

var codeGenerator = new ToWiring()
lcdDisplayScenario.accept(codeGenerator)
println(codeGenerator.getResult())
/exit