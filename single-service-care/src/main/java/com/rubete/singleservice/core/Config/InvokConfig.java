package com.rubete.singleservice.core.Config;


import com.rubete.singleservice.core.InvokManager;
import com.rubete.singleservice.core.annotation.Handle;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.ExecuteManage;
import com.rubete.singleservice.core.utils.AnnotationUtils;

import java.util.List;


public abstract class InvokConfig {

    public  InvokManager exec(){
        InvokManager invokManager = setSqlSessionTemplate(InvokManager.getInvokManager());
        List<Class> allClassByAnnotation = AnnotationUtils.getAllClassByAnnotation("com.rubete.singleservice.core", Handle.class);
        allClassByAnnotation.forEach(m-> {
            Handle annotation = (Handle) m.getAnnotation(Handle.class);
            try {
                Object o = m.newInstance();
                if (o instanceof AbstractHandle) {
                    AbstractHandle handle = (AbstractHandle) o;
                    handle.setOrder(annotation.value());
                    ExecuteManage.addHeader(handle);
                }

            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
        return invokManager;
    }
    public abstract InvokManager setSqlSessionTemplate(InvokManager invokManager);
}
