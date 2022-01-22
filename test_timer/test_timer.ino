// Wiring code generated from an ArduinoML model
// Application name: redButton

long debounce = 200;

enum STATE {state, start};
STATE currentState = start;

boolean buttonBounceGuard = false;
long buttonLastDebounceTime = 0;

long elapsed_time = 0;

void setup(){
  pinMode(9, INPUT);  // button [Sensor]
  pinMode(12, OUTPUT); // ll [Actuator]
  Serial.begin(9600); // open the serial port at 9600 bps:
}

void loop() {
  
        
        
        switch(currentState){
                case state:
                        digitalWrite(12,HIGH);
                        //buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
                        elapsed_time = millis() - buttonLastDebounceTime;
                        
                        Serial.println(elapsed_time);
                        if(elapsed_time>=3000){
                          currentState = start;
                        }
                break;
                case start:
                        digitalWrite(12,LOW);
                      
                        buttonBounceGuard = millis() - buttonLastDebounceTime > debounce;
                        if( digitalRead(9) == HIGH && buttonBounceGuard) {
                                buttonLastDebounceTime = millis();
                                currentState = state;
                        }
                break;
        }
}
