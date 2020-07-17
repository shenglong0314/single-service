package com.rubete.execute;
import com.rubete.singleservice.core.execute.*;
import org.junit.Test;

public class execute {

    @Test
    public void invoker(){
        ReceiverImpl receiver = new ReceiverImpl();
        Icommond commond = new ConcreteCommond(receiver);
        Receiver invoker = new ReceiverInvoker(commond);
        invoker.action();
    }
}
