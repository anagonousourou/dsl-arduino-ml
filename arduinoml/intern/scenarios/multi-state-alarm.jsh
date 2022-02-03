App multiStateAlarm = application("scenario4").uses(sensor("button").atPin(9)).uses(actuator("led").atPin(11)).
                uses(actuator("buz").atPin(12)).
                hasForState("start").initial().setting("led").toLow().setting("buz").toLow().endState().
                hasForState("state1").setting("buz").toHigh().endState().
                hasForState("state2").setting("buz").toLow().setting("led").toHigh().endState().
                beginTransitionTable().
                from("start").when("button").isHigh().goTo("state1").
                from("state1").when("button").isHigh().goTo("state2").
                from("state2").when("button").isHigh().goTo("start").
                endTransitionTable().
                build()
                
var codeGenerator = new ToWiring()
multiStateAlarm.accept(codeGenerator)
println(codeGenerator.getResult())
/exit