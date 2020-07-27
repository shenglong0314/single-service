package com.rubete.singleservice.core.fileter;


import com.rubete.singleservice.core.Parameter.Parameter;

public  class EmptyFilter extends AbstractFilter {

    public EmptyFilter() {
    }

    public EmptyFilter(AbstractFilter filter) {
        super(filter);
    }

    public EmptyFilter(int order) {
        super(order);
    }

    public EmptyFilter(int order, AbstractFilter filter) {
        super(order, filter);
    }

    @Override
    public Boolean beforeFileter(Parameter obj) {
        return false;
    }

    @Override
    public Boolean afterFileter(Parameter obj) {
        return false;
    }
}
