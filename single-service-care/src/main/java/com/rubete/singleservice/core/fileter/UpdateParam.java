package com.rubete.singleservice.core.fileter;

public class UpdateParam extends AbstractIParamFilter {
    @Override
    public Object before(Object obj) {
        System.out.println("========="+obj);
        return obj;
    }
}
