package com.rubete.singleservice.core.Config;


import com.rubete.singleservice.core.InvokManager;

import static com.rubete.singleservice.core.InvokManager.invokManager;


public abstract class InvokConfig {

    public  InvokManager exec(){
        InvokManager invokManager = setSqlSessionTemplate(InvokManager.getInvokManager());
        return invokManager;
    }
    public abstract InvokManager setSqlSessionTemplate(InvokManager invokManager);
}
