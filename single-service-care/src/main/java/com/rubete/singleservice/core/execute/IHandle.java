package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.Parameter;

public interface IHandle {

    void action(Parameter parameter);
    int getOrder();
    void setHandle(IHandle handle);
}
