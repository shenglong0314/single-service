package com.rubete.singleservice.core.Parameter;


import com.rubete.singleservice.core.execute.IActuator;
import com.rubete.singleservice.core.service.AbsServiceActuator;

public class BasicParameterActuator extends ParameterActuator {
    private Object data;
    @Override
    public Object action(AbsServiceActuator actuator) {
        this.data = actuator.action(this);
        return this.data;
    }
}
