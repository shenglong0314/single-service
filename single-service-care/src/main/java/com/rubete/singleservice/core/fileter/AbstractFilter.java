package com.rubete.singleservice.core.fileter;


public abstract class AbstractFilter implements IFilter,Comparable<AbstractFilter> {
   protected int order = 1000;
   private AbstractFilter next = new EmptyFilter();

    public AbstractFilter() {
    }
    public AbstractFilter( AbstractFilter filter) {
        this.next=filter;
    }

    public AbstractFilter(int order) {
        this.order = order;

    }
    public AbstractFilter(int order, AbstractFilter filter) {
        this.next=filter;
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
        return this.order-o.order;
    }

    @Override
    public Boolean before(Object obj) {
        if(this.beforeFileter(obj))next.before(obj);
        return this.beforeFileter(obj);
    }

    @Override
    public Boolean after(Object obj) {
        if(this.afterFileter(obj))next.after(obj);
        return this.afterFileter(obj);
    }

    public AbstractFilter getNext() {
        return next;
    }

    public void setNext(AbstractFilter next) {
        this.next = next;
    }

    public abstract Boolean beforeFileter(Object obj);

    public abstract Boolean afterFileter(Object obj);
}
