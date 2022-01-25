package io.github.mosser.arduinoml.kernel.behavioral;

import io.github.mosser.arduinoml.kernel.NamedElement;
import io.github.mosser.arduinoml.kernel.generator.Visitable;
import io.github.mosser.arduinoml.kernel.generator.Visitor;

public class ExceptionState  implements NamedElement, Visitable {

    private String name;
    private int exceptionCode;

    public ExceptionState(String name, int exceptionCode) {
        this.name = name;
        this.exceptionCode = exceptionCode;
    }

    @Override
    public void accept(Visitor visitor) {
       visitor.visit(this);
        
    }

    @Override
    public void setName(String name) {
        this.name=name;
        
    }

    @Override
    public String getName() {
        
        return this.name;
    }

    public int getExceptionCode() {
        return exceptionCode;
    }

    public void setExceptionCode(int exceptionCode) {
        this.exceptionCode = exceptionCode;
    }
    
}
