package io.github.mosser.arduinoml.kernel.generator;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.*;
import io.github.mosser.arduinoml.kernel.structural.*;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {
	enum PASS {
		ONE, TWO
	}

	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s", s));
	}

	@Override
	public void visit(App app) {
		// first pass, create global vars
		context.put("pass", PASS.ONE);
		w("// Wiring code generated from an ArduinoML model\n");
		w(String.format("// Application name: %s%n", app.getName()) + "\n");

		w("long debounce = 200;\n");

		w("\nenum STATE {");
		String sep = "";
		for (State state : app.getStates()) {
			w(sep);
			state.accept(this);
			sep = ", ";
		}
		w("};\n");
		if (app.getInitial() != null) {
			w("STATE currentState = " + app.getInitial().getName() + ";\n");
		}

		app.getStates().forEach(state -> state.getTemporalTransitions().forEach(transition -> transition.accept(this)));

		

		for (Brick brick : app.getBricks()) {
			brick.accept(this);
		}

		// second pass, setup and loop
		context.put("pass", PASS.TWO);
		w("\nvoid setup(){\n");
		for (Brick brick : app.getBricks()) {
			brick.accept(this);
		}
		w("}\n");

		w("\nvoid loop() {\n" +
				"\tswitch(currentState){\n");
		for (State state : app.getStates()) {
			state.accept(this);
		}
		w("\t}\n" +
				"}");
	}

	@Override
	public void visit(Actuator actuator) {
		if (context.get("pass") == PASS.ONE) {
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]%n", actuator.getPin(), actuator.getName()));
			return;
		}
	}

	@Override
	public void visit(Sensor sensor) {
		if (context.get("pass") == PASS.ONE) {
			w(String.format("%nboolean %sBounceGuard = false;%n", sensor.getName()));
			w(String.format("long %sLastDebounceTime = 0;%n", sensor.getName()));
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			w(String.format("  pinMode(%d, INPUT);  // %s [Sensor]%n", sensor.getPin(), sensor.getName()));
		}
	}

	@Override
	public void visit(State state) {
		if (context.get("pass") == PASS.ONE) {
			w(state.getName());
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			w("\t\tcase " + state.getName() + ":\n");
			for (Action action : state.getActions()) {
				action.accept(this);
			}

			state.getTransitions().forEach(transition -> transition.accept(this));
			state.getTemporalTransitions().forEach(transition -> transition.accept(this));
			state.getMultipleConditionTransitions().forEach(transition -> transition.accept(this));
			w("\t\tbreak;\n");
		}

	}

	@Override
	public void visit(Transition transition) {
		if (context.get("pass") == PASS.ONE) {
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			String sensorName = transition.getSensor().getName();
			w(String.format("\t\t\t%sBounceGuard = millis() - %sLastDebounceTime > debounce;%n",
					sensorName, sensorName));
			w(String.format("\t\t\tif( digitalRead(%d) == %s && %sBounceGuard) {%n",
					transition.getSensor().getPin(), transition.getValue(), sensorName));
			w(String.format("\t\t\t\t%sLastDebounceTime = millis();%n", sensorName));
			w("\t\t\t\tcurrentState = " + transition.getNext().getName() + ";\n");
			w("\t\t\t}\n");
		}
	}

	@Override
	public void visit(Action action) {
		if (context.get("pass") == PASS.ONE) {
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			w(String.format("\t\t\tdigitalWrite(%d,%s);%n", action.getActuator().getPin(), action.getValue()));
		}
	}

	@Override
	public void visit(TemporalTransition transition) {
		if (context.get("pass") == PASS.ONE) {
			w(String.format("long _temporal_transition_time%d = 0; %n", transition.getNumber()));
		}

		else if (context.get("pass") == PASS.TWO) {
			w(String.format(
					"\t\t\tif ( _temporal_transition_time%d == 0 )  {%n\t\t\t\t _temporal_transition_time%d = millis(); %n\t\t\t}%n\t\t\telse if( (_temporal_transition_time%d + %d) <= millis() ) { %n\t\t\t\tcurrentState = %s;%n\t\t\t\ttemporal_transition_time%d = 0;%n\t\t\t}%n",
					transition.getNumber(), transition.getNumber(), transition.getNumber(), transition.getAfter(),
					transition.getNext().getName(), transition.getNumber()));
		}

	}

	@Override
	public void visit(ConjunctionTransition transition) {

		if (context.get("pass") == PASS.TWO) {
			String sensorName = transition.getSensor1().getName();
			w(String.format("\t\t\t%sBounceGuard = millis() - %sLastDebounceTime > debounce;%n",
					sensorName, sensorName));

			if ("or".equals(transition.getOperator())) {
				w(String.format("\t\t\tif((digitalRead(%d) == %s || digitalRead(%d) == %s) && %sBounceGuard) {%n",
						transition.getSensor1().getPin(), transition.getValue(), transition.getSensor2().getPin(),
						transition.getValue(), sensorName));
			} else if ("and".equals(transition.getOperator())) {
				w(String.format("\t\t\tif((digitalRead(%d) == %s && digitalRead(%d) == %s) && %sBounceGuard) {%n",
						transition.getSensor1().getPin(), transition.getValue(), transition.getSensor2().getPin(),
						transition.getValue(), sensorName));
			}

			w(String.format("\t\t\t\t%sLastDebounceTime = millis();%n", sensorName));
			w("\t\t\t\tcurrentState = " + transition.getNext().getName() + ";\n");
			w("\t\t\t}\n");
		}
		// TODO Auto-generated method stub

	}

}
