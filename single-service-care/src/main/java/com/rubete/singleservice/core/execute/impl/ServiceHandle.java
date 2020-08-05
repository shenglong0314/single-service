package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.service.ServiceManage;
import com.rubete.singleservice.core.utils.OrderUtils;

public class ServiceHandle extends AbstractHandle {

    public ServiceHandle() {
        this.setOrder(OrderUtils.getServiceOrder());
    }

    public ServiceHandle(int order, IHandle handle) {
        super(order, handle);
    }

    public ServiceHandle(IHandle handle) {
        super(handle);
        this.setOrder(OrderUtils.getServiceOrder());
    }

    @Override
    public void action(Parameter parameter) {
        parameter.exc();
        //handle.action(parameter);
    }
}
