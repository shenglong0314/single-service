package com.rubete.singleservice.core.Parameter;

import com.rubete.singleservice.core.execute.IActuator;
public abstract class ParameterActuator implements IActuator {
    private String id;
    private Object obj;
    private Object data;

    public String getId() {
        return id;
    }

    public ParameterActuator setId(String id) {
        this.id = id;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public ParameterActuator setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public Object getData() {
        return data;
    }

    public ParameterActuator setData(Object data) {
        this.data = data;
        return this;
    }


}
