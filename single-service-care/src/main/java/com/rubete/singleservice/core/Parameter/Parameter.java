package com.rubete.singleservice.core.Parameter;


import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import java.util.function.Predicate;

public abstract class Parameter {
    protected String id;
    protected Object obj;
    protected Object data;
    protected Predicate fun;

    public String getId() {
        return id;
    }

    public Parameter setId(String id) {
        this.id = id;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public Parameter setObj(Object obj) {
        this.obj = obj;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Parameter setData(Object data) {
        this.data = data;
        return this;
    }

    public Predicate getFun() {
        return fun;
    }

    public void setFun(Predicate fun) {
        this.fun = fun;
    }

}
