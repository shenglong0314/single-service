package com.rubete.singleservice.core.fileter;


import com.rubete.singleservice.core.Parameter.Parameter;

public abstract class AbstractFilter implements IFilter, Comparable<AbstractFilter> {
    protected int order = 1000;
    private IFilter next = null;

    public AbstractFilter() {
    }

    public AbstractFilter(IFilter filter) {
        this.next = filter;
    }

    public AbstractFilter(int order) {
        this.order = order;

    }

    public AbstractFilter(int order, IFilter filter) {
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
        if (this.beforeFileter(obj)){
            if(next ==null ){
               return true;
            }
            return next.before(obj);
        }

        return false;
    }

    @Override
    public Boolean after(Parameter obj) {
        if (this.afterFileter(obj)){
            if(next == null){
                return true;
            }
            return next.after(obj);

        }


        return false;
    }

    public IFilter getNext() {
        return next;
    }

    public void setNext(IFilter next) {
        this.next = next;
    }

    public abstract Boolean beforeFileter(Parameter obj);

    public abstract Boolean afterFileter(Parameter obj);
}
