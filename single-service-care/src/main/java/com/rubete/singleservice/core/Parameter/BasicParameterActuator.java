package com.rubete.singleservice.core.Parameter;


import com.rubete.singleservice.core.execute.IActuator;

public class BasicParameterActuator extends ParameterActuator {
    private Object data;
    @Override
    public Object action(IActuator actuator) {
        this.data = actuator.action(this);
        return this.data;
    }
}
