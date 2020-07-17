package com.rubete.singleservice.core.execute;

public abstract class CommondAbs implements Icommond {
    protected Receiver receiver;

    public CommondAbs(Receiver receiver) {
        this.receiver = receiver;
    }


    @Override
    public void execute() {
        before();
        receiver.action();
        after();
    }
    public abstract void before();
    public abstract void after();


}
