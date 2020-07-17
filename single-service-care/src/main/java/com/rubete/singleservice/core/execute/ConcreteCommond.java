package com.rubete.singleservice.core.execute;

public class ConcreteCommond extends CommondAbs {

    public ConcreteCommond(Receiver receiver){
       super(receiver);
    }

    @Override
    public void before() {
        System.out.println("before===================");
    }

    @Override
    public void after() {
        System.out.println("after===================");
    }

}
