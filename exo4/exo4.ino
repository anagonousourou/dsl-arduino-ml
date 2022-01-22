// Wiring code generated from an ArduinoML model
// Application name: redButton

long debounce = 200;

enum STATE {stateA, stateB, start};
STATE currentState = start;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

void setup(){
  pinMode(9, INPUT);  // button [Sensor]
  pinMode(12, OUTPUT); // buz [Actuator]
  pinMode(11, OUTPUT); // ll [Actuator]
}

void loop() {
        switch(currentState){
                case stateA:
                        digitalWrite(12,HIGH);
                        buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
                        if( digitalRead(9) == HIGH && buttonBounceGuard) {
                                buttonLastDebounceTime = millis();
                                currentState = stateB;
                        }
                break;
                case stateB:
                        digitalWrite(12,LOW);
                        digitalWrite(11,HIGH);
                        buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
                        if( digitalRead(9) == HIGH && buttonBounceGuard) {
                                buttonLastDebounceTime = millis();
                                currentState = start;
                        }
                break;
                case start:
                        digitalWrite(12,LOW);
                        digitalWrite(11,LOW);
                        buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
                        if( digitalRead(9) == HIGH && buttonBounceGuard) {
                                buttonLastDebounceTime = millis();
                                currentState = stateA;
                        }
                break;
        }
}
