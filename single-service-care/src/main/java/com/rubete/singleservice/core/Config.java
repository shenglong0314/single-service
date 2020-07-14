package com.rubete.singleservice.core;


public class Config {
    private InvokManage invokMange = InvokManage.getInvokManage();

    public InvokManage getInvokMange() {
        return invokMange;
    }

    public void setInvokMange(InvokManage invokMange) {
        this.invokMange = invokMange;
    }

}
