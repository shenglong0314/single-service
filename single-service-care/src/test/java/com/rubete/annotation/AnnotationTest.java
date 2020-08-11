package com.rubete.annotation;


import com.rubete.singleservice.core.annotation.Handle;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.utils.AnnotationUtils;


import java.lang.annotation.Annotation;
import java.util.List;


public class AnnotationTest {
    public static void main(String[] args) {

        List<Class> allClassByAnnotation = AnnotationUtils.getAllClassByAnnotation("com.rubete.singleservice.core", Handle.class);
        allClassByAnnotation.forEach(m->{

            try {
                AbstractHandle handle =  (AbstractHandle) m.newInstance();
                if(handle instanceof AbstractHandle ){
                    System.out.println(111111111);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            Handle annotation = (Handle)m.getAnnotation(Handle.class);
            System.out.println(m);
            System.out.println(annotation.value());

        });
    }
}
