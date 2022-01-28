package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;

public class Print extends Action {

	private String value;
	private LCDScreen lcdScreen;


	public String getStringValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public LCDScreen getActuator() {
		return lcdScreen;
	}

	public void setActuator(LCDScreen actuator) {
		this.lcdScreen = actuator;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
