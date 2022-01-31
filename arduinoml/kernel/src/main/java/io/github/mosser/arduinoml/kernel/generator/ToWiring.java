package io.github.mosser.arduinoml.kernel.generator;

import java.util.HashSet;
import java.util.Set;

import io.github.mosser.arduinoml.kernel.App;
import io.github.mosser.arduinoml.kernel.behavioral.Action;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionState;
import io.github.mosser.arduinoml.kernel.behavioral.ExceptionTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Print;
import io.github.mosser.arduinoml.kernel.behavioral.State;
import io.github.mosser.arduinoml.kernel.behavioral.TemporalTransition;
import io.github.mosser.arduinoml.kernel.behavioral.Transition;
import io.github.mosser.arduinoml.kernel.structural.Actuator;
import io.github.mosser.arduinoml.kernel.structural.Brick;
import io.github.mosser.arduinoml.kernel.structural.LCDScreen;
import io.github.mosser.arduinoml.kernel.structural.Sensor;
import io.github.mosser.arduinoml.kernel.structural.TransitionCondition;

/**
 * Quick and dirty visitor to support the generation of Wiring code
 */
public class ToWiring extends Visitor<StringBuffer> {
	enum PASS {
		INITIAL,ONE, TWO, THREE
	}
    private boolean firstCondition = true;

	public ToWiring() {
		this.result = new StringBuffer();
	}

	private void w(String s) {
		result.append(String.format("%s", s));
	}


    @Override
    public void visit(App app) {
        this.result = new StringBuffer();

        w("// Wiring code generated from an ArduinoML model\n");
        w(String.format("// Application name: %s%n", app.getName()) + "\n");

        context.put("pass", PASS.INITIAL);
		for (Brick brick : app.getBricks()) {
			brick.accept(this);
		}
        // first pass, create global vars
        context.put("pass", PASS.ONE);

        w("long debounce = 200;\n");

        w("\nenum STATE {");
        String sep = "";
        for (State state : app.getStates()) {
            w(sep);
            state.accept(this);
            sep = ", ";
        }
        for (ExceptionState state : app.getExceptionStates()) {
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

        w(String.format("\nvoid %s() {\n",app.getMustPrintWithLcd()?"mainLoop":"loop") +
                "\tswitch(currentState){\n");
        for (State state : app.getStates()) {
            state.accept(this);
        }
        for (ExceptionState state : app.getExceptionStates()) {
            state.accept(this);
        }
        w("\t}\n" +
                "}");
        if(app.getMustPrintWithLcd()){
            context.put("pass", PASS.THREE);
            for (Brick brick : app.getBricks()) {
                brick.accept(this);
            }
        }
    }

	@Override
	public void visit(LCDScreen lcdScreen) {
		visitLCD();
	}

	private void visitLCD() {

		if(context.get("pass") == PASS.INITIAL) {
            w("/*\n");
            w("Arduino Protothreading Example v1.1\n");
            w("by Drew Alden (@ReanimationXP) 1/12/2016\n");
            w("- Update: v1.1 - 8/18/17\n");
            w("  Arduino 1.6.6+ prototyping changed, small fixes.\n");
            w("  (create functions ahead of use, removed foreach and related library).\n");

            w("  Note that TimedAction is now out of date. Be sure to read notes about\n");
            w("  TimedAction and WProgram.h / Arduino.h errors.\n");
            w("*/\n");

            w("//COMPONENTS\n");

            w("/*\n");
            w("This code was made using the Sunfounder Arduino starter kit's blue LCD.\n");
            w("It can be found at Amazon.com in a variety of kits.\n");
            w("*/\n");

            w("//THIRD-PARTY LIBRARIES\n");
            w("//these must be manually added to your Arduino IDE installation\n");

            w("//TimedAction\n");
            w("//allows us to set actions to perform on separate timed intervals\n");
            w("//http://playground.arduino.cc/Code/TimedAction\n");
            w("//http://wiring.uniandes.edu.co/source/trunk/wiring/firmware/libraries/TimedAction\n");

            w("#include <TimedAction.h>\n");
            w("//NOTE: This library has an issue on newer versions of Arduino. After\n");
            w("//      downloading the library you MUST go into the library directory and\n");
            w("//      edit TimedAction.h. Within, overwrite WProgram.h with Arduino.h\n");


            w("//NATIVE LIBRARIES\n");

            w("#include <LiquidCrystal.h>\n");

			return;
		}
		if(context.get("pass") == PASS.ONE) {
            w("bool lcd_update = false;\n");

            w("String text(\"Waiting for text to print, but need to put more till overload the screen!!\");\n");
            w("String currentPrintedText;\n");

            w("void update_lcd(String _text){\n");
                w("    if(_text==nullptr || currentPrintedText==_text )return;\n");
                w("    text = _text;\n");
                w("    lcd_update = true;\n");
                w("    currentPrintedText=_text;\n");
                w("}\n");
			w("LiquidCrystal lcd(2, 3, 4, 5, 6, 7, 8);\n");
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			//lcdScreen.getPin(), lcdScreen.getName()
			w("  lcd.begin(16, 2); //  [LCDScreen]\n");
		}
        if(context.get("pass") == PASS.THREE){

            w("TimedAction mainLoopThread = TimedAction(300,mainLoop);\n");
            w("void printString(){\n");
            w("	lcd.clear();\n");
            w("	bool endLoop = false;\n");
            w("	const int interval = text.length();\n");
            w("	const int max_chars_on_line = 16;\n");
            w("	for (int i=0;i<interval&&not endLoop;i++){\n");
            w("		mainLoopThread.check();\n");
            w("		int endscreen1 = i+((interval-i)>max_chars_on_line? max_chars_on_line:interval);\n");
            w("		lcd.setCursor(0,0);\n");
            w("		lcd.print(text.substring(i,endscreen1));\n");

            w("		int rest = interval-endscreen1;\n");
            w("		int endscreen2 = 0;\n");
            w("		if (rest>max_chars_on_line){\n");
            w("			endscreen2 = endscreen1+max_chars_on_line;\n");
            w("		}else{\n");
            w("			endscreen2 = rest;\n");
            w("			endLoop=true;\n");
            w("		}\n");
            w("		lcd.setCursor(0,1);\n");
            w("		lcd.print(text.substring(endscreen1,endscreen1+endscreen2));\n");
            w("		if(lcd_update){\n");
            w("		    lcd_update=false;\n");
            w("		    return;\n");
            w("		}\n");
            w("		delay(endLoop?600:650);\n");
            w("	}\n");
            w("}\n\n");
            w("void loop(){\n");
            w("    printString();\n");
            w("}\n");
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
    public void visit(Transition transition) {
        if (context.get("pass") == PASS.ONE) {
            return;
        }
        if (context.get("pass") == PASS.TWO) {

            transition.getTransitionCondition().accept(this);

            w("\t\t\t\tcurrentState = " + transition.getNext().getName() + ";\n");
            w("\t\t\t}\n");
        }
    }



	@Override
	public void visit(Print print) {
		if(context.get("pass") == PASS.ONE) {
			return;
		}
		if(context.get("pass") == PASS.TWO) {
			//print.getActuator().getPin(),
            String sep = "\t\t\t";
            w(String.format("%supdate_lcd(%s);%n",sep,print.getStringValue(sep+sep)));
			//return;
		}
	}
	
	@Override
	public void visit(TemporalTransition transition) {
		if (context.get("pass") == PASS.ONE) {
			w(String.format("long _temporal_transition_time%d = 0; %n", transition.getNumber()));
		}

		else if (context.get("pass") == PASS.TWO) {
			w(String.format(
					"\t\t\tif ( _temporal_transition_time%d == 0 )  {%n\t\t\t\t _temporal_transition_time%d = millis(); %n\t\t\t}%n\t\t\telse if( (_temporal_transition_time%d + %d) <= millis() ) { %n\t\t\t\tcurrentState = %s;%n\t\t\t\t_temporal_transition_time%d = 0;%n\t\t\t}%n",
					transition.getNumber(), transition.getNumber(), transition.getNumber(), transition.getAfter(),
					transition.getNext().getName(), transition.getNumber()));
		}

	}

	/*@Override
	public void visit(MultipleConditionTransition transition) {

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

	}*/

    @Override
	public void visit(Actuator actuator) {
		if (actuator instanceof LCDScreen){
			visitLCD();
			return;
		}
		if (context.get("pass") == PASS.ONE) {
			return;
		}
		if (context.get("pass") == PASS.TWO) {
			w(String.format("  pinMode(%d, OUTPUT); // %s [Actuator]\n", actuator.getPin(), actuator.getName()));
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

            if (!state.getExceptionTransitions().isEmpty() || !state.getTransitions().isEmpty()) {
                Set<Sensor> sensors = new HashSet<>();
                state.getTransitions().forEach(transition -> {
                    transition.getTransitionCondition().getSensors().forEach(sensors::add);

                });

                state.getExceptionTransitions().forEach(transition -> {
                    transition.getTransitionCondition().getSensors().forEach(sensors::add);

                });
                sensors.forEach(sensor -> {
                    w(String.format("\t\t\t%sBounceGuard = millis() - %sLastDebounceTime > debounce;%n",
                            sensor.getName(), sensor.getName()));
                });
            }

            this.firstCondition = true;
            state.getExceptionTransitions().forEach(transition -> transition.accept(this));
            state.getTransitions().forEach(transition -> transition.accept(this));
            state.getTemporalTransitions().forEach(transition -> transition.accept(this));
            this.firstCondition = true;
            w("\t\tbreak;\n");
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
    public void visit(TransitionCondition transitionCondition) {

        Sensor firstSensor = transitionCondition.getSensors().get(0);

        String elseToken = "";
        if (!this.firstCondition) {
            elseToken = "else ";
        }

        if (transitionCondition.getSensors().size() == 1) {
            w(String.format("\t\t\t%sif( digitalRead(%d) == %s ", elseToken, firstSensor.getPin(),
                    transitionCondition.getValue()));
        } else {
            w(String.format("\t\t\t%sif((digitalRead(%d) == %s", elseToken, firstSensor.getPin(),
                    transitionCondition.getValue()));
        }

        for (int i = 1; i < transitionCondition.getSensors().size(); i++) {
            if ("and".equals(transitionCondition.getOperator())) {
                w(" && ");
            } else if ("or".equals(transitionCondition.getOperator())) {
                w(" || ");
            }
            w(String.format("digitalRead(%d) == %s) ", transitionCondition.getSensors().get(i).getPin(),
                    transitionCondition.getValue()));
        }

        w(String.format("&& %sBounceGuard) {%n",
                firstSensor.getName()));
        w(String.format("\t\t\t\t%sLastDebounceTime = millis();%n", firstSensor.getName()));
        if (this.firstCondition) {
            this.firstCondition = false;
        }

    }

    @Override
    public void visit(ExceptionTransition exceptionTransition) {
        if (context.get("pass") == PASS.ONE) {
            return;
        }
        if (context.get("pass") == PASS.TWO) {

            exceptionTransition.getTransitionCondition().accept(this);

            w("\t\t\t\tcurrentState = " + exceptionTransition.getNext().getName() + ";\n");
            w("\t\t\t}\n");
        }

    }

    @Override
    public void visit(ExceptionState exceptionState) {
        if (context.get("pass") == PASS.ONE) {
            w(exceptionState.getName());
        } else if (context.get("pass") == PASS.TWO) {
            w("\t\tcase " + exceptionState.getName() + ":\n");
            w(String.format("\t\t\tfor( int  _i = 0; _i < %d ; _i++){%n", exceptionState.getExceptionCode()));
            w("\t\t\t\tdigitalWrite(12,HIGH);\n");
            w("\t\t\t\tdelay(500);\n");
            w("\t\t\t\tdigitalWrite(12,LOW);\n");
            w("\t\t\t\tdelay(500);\n");
            w("\t\t\t}\n");
            w("\t\t\tdelay(2000);\n");
            w("\t\tbreak;\n");
        }

    }


}
