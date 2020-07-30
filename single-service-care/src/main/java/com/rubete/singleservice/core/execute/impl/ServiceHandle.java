package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.utils.OrderUtils;

public class ServiceHandle extends AbstractHandle {

    public ServiceHandle() {
        this.setOrder(OrderUtils.getFilterOrder());
    }

    public ServiceHandle(int order, IHandle handle) {
        super(order, handle);
    }

    public ServiceHandle(IHandle handle) {
        super(handle);
        this.setOrder(OrderUtils.getFilterOrder());
    }

    @Override
    public void action(Parameter parameter) {
        parameter.getService().action(parameter);
        handle.action(parameter);
    }
}
