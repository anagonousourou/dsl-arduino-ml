package io.github.mosser.arduinoml.kernel.behavioral;

import java.util.HashMap;
import java.util.Map;

import io.github.mosser.arduinoml.kernel.generator.Visitor;
import io.github.mosser.arduinoml.kernel.structural.Brick;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;

public class Print extends Action {
	private LCDScreen lcdScreen;
	private Integer counter = 0;
	private final Map<String, Brick> bricksToPrint;
	private final Map<String, String> stringsToPrint;

	public Print() {
		bricksToPrint = new HashMap<>();
		stringsToPrint = new HashMap<>();
	}

	public void printBrick(Brick brick) {
		bricksToPrint.put((counter++).toString(), brick);
	}

	public void printString(String string) {
		if (string.startsWith("\"") && string.endsWith("\"")) {
			stringsToPrint.put((counter++).toString(), string);
		} else {
			stringsToPrint.put((counter++).toString(), '"' + string + '"');
		}

	}

	public String getStringValue(String sep) {
		String str = "";
		StringBuilder strBuilder = new StringBuilder(str);
		for (int i = 0; i < counter; i++) {
			String key = Integer.toString(i);
			if (bricksToPrint.containsKey(key))
				strBuilder.append(String.format("String(\"%s := \") + String(digitalRead(%d)==1? \"ON\":\"OFF\")",
						bricksToPrint.get(key).getName(), bricksToPrint.get(key).getPin()));
			if (stringsToPrint.containsKey(key))
				strBuilder.append(stringsToPrint.get(key));
			if (i < counter - 1)
				strBuilder.append(String.format(" + %n%s", sep));
		}
		return strBuilder.toString();
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
