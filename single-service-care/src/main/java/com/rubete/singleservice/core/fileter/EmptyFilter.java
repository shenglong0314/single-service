package com.rubete.singleservice.core.fileter;


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
    public Boolean beforeFileter(Object obj) {
        return false;
    }

    @Override
    public Boolean afterFileter(Object obj) {
        return false;
    }
}
