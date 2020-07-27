package com.rubete.singleservice.core.execute;

public abstract class AbstractHandle implements IHandle,Comparable<AbstractHandle> {
   protected int order = 1000;
   protected IHandle handle = new EmptyHandle();

    public AbstractHandle() {
    }

    public AbstractHandle(int order, IHandle handle) {
        this.order = order;
        this.handle = handle;
    }
    public AbstractHandle(IHandle handle) {
        this.order = order;
        this.handle = handle;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public IHandle getHandle() {
        return handle;
    }

    public void setHandle(IHandle handle) {
        this.handle = handle;
    }

    @Override
    public int compareTo(AbstractHandle o) {
        return this.order-o.order;
    }

}
