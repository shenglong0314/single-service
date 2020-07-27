package com.rubete.singleservice.core.fileter;


import com.rubete.singleservice.core.Parameter.Parameter;

public abstract class AbstractFilter implements IFilter, Comparable<AbstractFilter> {
    protected int order = 1000;
    private AbstractFilter next = null;

    public AbstractFilter() {
    }

    public AbstractFilter(AbstractFilter filter) {
        this.next = filter;
    }

    public AbstractFilter(int order) {
        this.order = order;

    }

    public AbstractFilter(int order, AbstractFilter filter) {
        this.next = filter;
        this.order = order;

    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public int compareTo(AbstractFilter o) {
        return this.order - o.order;
    }

    @Override
    public Boolean before(Parameter obj) {
        if (this.beforeFileter(obj)) next.before(obj);
        return this.beforeFileter(obj);
    }

    @Override
    public Boolean after(Parameter obj) {
        if (this.afterFileter(obj)) {
            next.after(obj);
            return true;
        }
        return false;
    }

    public AbstractFilter getNext() {
        return next;
    }

    public void setNext(AbstractFilter next) {
        this.next = next;
    }

    public abstract Boolean beforeFileter(Parameter obj);

    public abstract Boolean afterFileter(Parameter obj);
}
