package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.impl.EmptyHandle;
import com.rubete.singleservice.core.execute.impl.FilterHandle;
import com.rubete.singleservice.core.execute.impl.ResponseEntityHandle;
import com.rubete.singleservice.core.execute.impl.ServiceHandle;


import java.util.*;

public class ExecuteManage {

    // private static final List<AbstractHandle> handles=new ArrayList<>();
    private static final TreeSet<AbstractHandle> handles=new TreeSet<>();
    private static final ExecuteManage executeManager=new ExecuteManage();

    public ExecuteManage() {

    }

    public  void execute(Parameter parameter){
        handles.first().action(parameter);
    }

    public static ExecuteManage getExecuteManager() {
        return executeManager;
    }
    public static  ExecuteManage addHeader(AbstractHandle abstractHandle) {
        handles.add(abstractHandle);
        ExecuteManage.getExecuteManager().order();
        return executeManager;
    }

   /* private  void init(){
        handles.add(new ResponseEntityHandle());
        handles.add(new ServiceHandle());
        handles.add(new FilterHandle());
        order();
    }*/

    private  ExecuteManage order(){

        Iterator<AbstractHandle> iterator = handles.iterator();
        iterator.next();
        for (AbstractHandle handle : handles) {
            if(iterator.hasNext()){
                AbstractHandle next = iterator.next();
                handle.setHandle(next);
            }
        }
        return executeManager;
    }
}
