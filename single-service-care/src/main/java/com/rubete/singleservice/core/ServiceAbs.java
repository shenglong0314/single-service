package com.rubete.singleservice.core;

import java.util.Map;

public abstract class ServiceAbs<R> implements Service <R> {
    protected Map<String,Object> map;
    public R exc(R r){
        this.res(r);
        return r;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public abstract void res(R r);
}
