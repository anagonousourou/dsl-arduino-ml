package io.github.mosser.arduinoml.kernel.samples;

public class Switch {

	/*public static void main(String[] args) {

		// Declaring elementary bricks
		Sensor button = new Sensor();
		button.setName("button");
		button.setPin(9);

		Actuator led = new Actuator();
		led.setName("LED");
		led.setPin(12);

		LCDScreen lcd = new LCDScreen();
		lcd.setName("LcdScreen");
		lcd.setBus(13);

		// Declaring states
		State on = new State();
		on.setName("on");

		State off = new State();
		off.setName("off");

		// Creating actions
		Action switchTheLightOn = new Action();
		switchTheLightOn.setActuator(led);
		switchTheLightOn.setValue(SIGNAL.HIGH);

		Action switchTheLightOff = new Action();
		switchTheLightOff.setActuator(led);
		switchTheLightOff.setValue(SIGNAL.LOW);

		
		Print printHelloWorld = new Print();
		printHelloWorld.setActuator(lcd);
		printHelloWorld.setValue("Hello, world!!");
		// Binding actions to states
		on.setActions(Arrays.asList(switchTheLightOn,printHelloWorld));
		off.setActions(Arrays.asList(switchTheLightOff));

		// Creating transitions
		Transition on2off = new Transition();
		on2off.setNext(off);
		on2off.setSensor(button);
		on2off.setValue(SIGNAL.HIGH);

		Transition off2on = new Transition();
		off2on.setNext(on);
		off2on.setSensor(button);
		off2on.setValue(SIGNAL.HIGH);

		// Binding transitions to states
		on.addTransition(on2off);
		off.addTransition(off2on);

		// Building the App
		App theSwitch = new App();
		theSwitch.setName("Switch!");
		theSwitch.setBricks(Arrays.asList(button, led , lcd));
		theSwitch.setStates(Arrays.asList(on, off));
		theSwitch.setInitial(off);

		// Generating Code
		Visitor codeGenerator = new ToWiring();
		theSwitch.accept(codeGenerator);

		// Printing the generated code on the console
		System.out.println(codeGenerator.getResult());
	}*/

}
