package com.rubete.singleservice.core.fileter.impl;


import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.fileter.AbstractFilter;

public  class EmptyFilter extends AbstractFilter {

    public EmptyFilter() {
    }

    @Override
    public Boolean beforeFileter(Parameter obj) {
        System.out.println("beforeFileter"+obj);
        return true;
    }

    @Override
    public Boolean afterFileter(Parameter obj) {
        System.out.println("afterFileter"+obj);
        return true;
    }

}
