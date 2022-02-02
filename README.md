# ArduinoML


__Authors__:
  * [ANAGONOU Patrick]()
  * [ANIGLO Jonas]()
  * [FRANCIS Anas]()
  * [ZABOURDINE Soulaiman]()
  
This repository is an implementation of  ArduinoML.

## Domain Description

ArduinoML is an example of a _Domain Specific Language_ (DSL), designed to model simple application executed on top of Arduino boards. It is specific to this class of applications, _i.e._, allowing anyone to model simple pieces of software that bind sensors to actuators. 

For example, let’s consider the following scenario: _“As a user, considering a button and a LED, I want to switch on the LED after pushing the button. Pushing the button again will switch it off, and so on”_. The essence of ArduinoML is to support the definition of such an application. 


![](https://raw.githubusercontent.com/mosser/ArduinoML-kernel/master/docs/platform_small.png)

## Repository Organization

  * `docs` contains the pdf report of the project
  * `uml` contains the png, svg and Visual Paradigm files of the class diagramm that  models and implementations of the abstract syntax of the language.
  * `arduinoml` implementation of the kernel, the external DSL and embedded DSL
  * `subject` the pdf subject of the project
  * `plugin-vscode` Vscode plugin for the external DSL


## References

  * https://github.com/mosser/ArduinoML-kernel: The repository that contains the original basic code of ArduinoML