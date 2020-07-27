package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.DefaultParameter;
import com.rubete.singleservice.core.fileter.AbstractFilter;
import com.rubete.singleservice.core.service.AbsServiceActuator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ServiceHandle extends AbstractHandle {
   private AbsServiceActuator actuator;

    public ServiceHandle(AbsServiceActuator actuator) {
        this.setOrder(1000);
        this.actuator = actuator;
    }

    public ServiceHandle(int order, IHandle handle, AbsServiceActuator actuator) {
        super(order, handle);
        this.actuator = actuator;
    }

    public ServiceHandle(IHandle handle, AbsServiceActuator actuator) {
        super(handle);
        this.setOrder(1000);
        this.actuator = actuator;
    }

    @Override
    public void action(DefaultParameter defaultParameter) {
        defaultParameter.setData(actuator.action(defaultParameter));
        handle.action(defaultParameter);
    }
}
