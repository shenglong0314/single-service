package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.Parameter;


public interface IHandle extends IOreder {

    void action(Parameter parameter);
    void setHandle(IHandle handle);
}
