# ArduinoML Kernel implementation for the JVM

  * Author: [Sebastien Mosser](mailto?mosser@i3s.unice.fr)
  * Authors: ANAGONOU Patrick, ANIGLO Jonas, FRANCIS Anas, ZABOURDINE Soulaiman
  * Version: 1.0

This is an implementation of the ArduinoML kernel, using the Java language.

## Organization

  * `kernel` contains the `App' concept, which is the root of the abstract syntax.
  * `kernel.structural` defines the concept of `Brick`s, as `Sensor`s and `Actuator`s. It also defines the available
     signals.
  * `kernel.behavioral` implements classes for `State`s, `Action`s, `Transition`s, `TemporalTransition`s, and `MultipleConditionTransition`.
  * `kernel.generator` maps a Visitor pattern to the ArduinoML kernel, and provides an implementation for such a visitor
    that generates Wiring code
  * `kernel.samples` contains sample code using the kernel.

## How to work with the kernel

The kernel is imported as a dependency inside the `intern` and `extern` modules.
