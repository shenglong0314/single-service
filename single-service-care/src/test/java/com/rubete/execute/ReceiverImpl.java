package com.rubete.execute;

import com.rubete.singleservice.core.execute.Receiver;

public class ReceiverImpl implements Receiver {
    @Override
    public void action() {
        System.out.println("aaa");
    }
}
