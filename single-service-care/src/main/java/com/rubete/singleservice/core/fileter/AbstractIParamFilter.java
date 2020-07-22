package com.rubete.singleservice.core.fileter;


public abstract class AbstractIParamFilter implements IFilter {
    public Object action(Object obj){
     return before(obj);
    }
    public abstract Object before(Object obj);
}
