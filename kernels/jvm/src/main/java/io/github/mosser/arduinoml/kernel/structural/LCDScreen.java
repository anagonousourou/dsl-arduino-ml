package io.github.mosser.arduinoml.kernel.structural;


public class LCDScreen extends Actuator {
	public void setBus(int bus){
		setPin(bus);
	}

	@Override
	public void setName(String name) {
		//setName(name);
	}
}
