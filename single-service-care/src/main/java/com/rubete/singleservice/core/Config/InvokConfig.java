package com.rubete.singleservice.core.Config;


import com.rubete.singleservice.core.InvokManager;


public abstract class InvokConfig {
    private InvokManager invokManager=InvokManager.getInvokManager();

    public  void exec(){
        setSqlSessionTemplate(invokManager);
    }

    public abstract InvokManager setSqlSessionTemplate(InvokManager invokManager);
}
