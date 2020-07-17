package com.rubete.singleservice.core.execute;

public  class ReceiverInvoker implements Receiver {
    private Icommond commond;
    public ReceiverInvoker(Icommond commond){
     this.commond = commond;
    }
    public void action(){
        commond.execute();
    }
}
