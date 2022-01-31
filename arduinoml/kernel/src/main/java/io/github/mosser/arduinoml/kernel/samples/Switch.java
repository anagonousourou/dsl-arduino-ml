package io.github.mosser.arduinoml.kernel.samples;

import java.util.Arrays;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.DigitalAction;
import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.generator.ToWiring;
import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.SIGNAL;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

public class Switch {

	public static void main(String[] args) {

		// Declaring elementary bricks
		Sensor button = new Sensor();
		button.setName("button");
		button.setPin(9);

		Actuator led = new Actuator();
		led.setName("led");
		led.setPin(12);

		LCDScreen lcd = new LCDScreen();
		lcd.setName("lcd");

		// Declaring states
		State on = new State();
		on.setName("on");

		State off = new State();
		off.setName("off");

		// Creating actions
		DigitalAction switchTheLightOn = new DigitalAction();
		switchTheLightOn.setActuator(led);
		switchTheLightOn.setValue(SIGNAL.HIGH);

		DigitalAction switchTheLightOff = new DigitalAction();
		switchTheLightOff.setActuator(led);
		switchTheLightOff.setValue(SIGNAL.LOW);

		Print printHelloWorld = new Print();
		printHelloWorld.setActuator(lcd);
		printHelloWorld.printString("Hello, world!!");
		// Binding actions to states
		on.setActions(Arrays.asList(switchTheLightOn, printHelloWorld));
		off.setActions(Arrays.asList(switchTheLightOff));

		// Creating transitions
		Transition on2off = new Transition();
		on2off.setNext(off);
		TransitionCondition condition = new TransitionCondition();
		condition.addSensor(button);
		condition.setValue(SIGNAL.HIGH);
		on2off.setTransitionCondition(condition);

		TransitionCondition condition2 = new TransitionCondition();
		condition2.addSensor(button);
		condition2.setValue(SIGNAL.HIGH);
		
		Transition off2on = new Transition();
		off2on.setNext(on);
		off2on.setTransitionCondition(condition2);

		// Binding transitions to states
		on.addTransition(on2off);
		off.addTransition(off2on);

		// Building the App
		App theSwitch = new App();
		theSwitch.setName("Switch!");
		theSwitch.setBricks(Arrays.asList(button, led, lcd));
		theSwitch.setStates(Arrays.asList(on, off));
		theSwitch.setInitial(off);

		// Generating Code
		Visitor<StringBuffer> codeGenerator = new ToWiring();
		theSwitch.accept(codeGenerator);

		// Printing the generated code on the console
		System.out.println(codeGenerator.getResult());
	}

}
