package com.rubete.singleservice.core.fileter.impl;


import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.fileter.AbstractFilter;

public  class EmptyFilter extends AbstractFilter {

    public EmptyFilter() {
    }

    @Override
    public Boolean beforeFileter(Parameter obj) {
        System.out.println("beforeFileter");
        return true;
    }

    @Override
    public Boolean afterFileter(Parameter obj) {
        System.out.println("afterFileter");
        return true;
    }

}
