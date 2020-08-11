package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.annotation.Handle;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.utils.OrderUtils;

@Handle(1000)
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
        System.out.println("最后一个");
        //handle.action(parameter);
    }
}
