package com.rubete.singleservice.core.Parameter;

import com.rubete.singleservice.core.execute.IActuator;
import com.rubete.singleservice.core.fileter.IDataFilter;
import com.rubete.singleservice.core.service.AbsServiceActuator;

import java.util.function.Function;
import java.util.function.Predicate;

public abstract class ParameterActuator {
    private String id;
    private Object obj;
    private Object data;
    private Predicate fun;
    private IDataFilter dataFilter;

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
    public abstract Object action(AbsServiceActuator actuator);

    public Predicate getFun() {
        return fun;
    }

    public void setFun(Predicate fun) {
        this.fun = fun;
    }

    public IDataFilter getDataFilter() {
        return dataFilter;
    }

    public void setDataFilter(IDataFilter dataFilter) {
        this.dataFilter = dataFilter;
    }
}
