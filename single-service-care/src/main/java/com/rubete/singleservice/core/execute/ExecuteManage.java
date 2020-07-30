package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.impl.EmptyHandle;
import com.rubete.singleservice.core.execute.impl.FilterHandle;
import com.rubete.singleservice.core.execute.impl.ResponseEntityHandle;
import com.rubete.singleservice.core.execute.impl.ServiceHandle;


import java.util.ArrayList;
import java.util.List;

public class ExecuteManage {

    private final List<IHandle> handles=new ArrayList<>();

    public ExecuteManage() {
        this.init();
    }

    public void execute(Parameter parameter){
        handles.get(0).action(parameter);
    }

    private void init(){
        this.handles.add(new ResponseEntityHandle());
        this.handles.add(new ServiceHandle());
        this.handles.add(new FilterHandle());
        this.order();
    }

    private ExecuteManage order(){
        this.handles.sort((m,n)->{return m.getOrder()-n.getOrder();});
        for(int i = 0;i < this.handles.size();i++){
            if((i+1) < this.handles.size()){
                this.handles.get(i).setHandle(this.handles.get(i+1));
            }else {
                this.handles.get(i).setHandle(new EmptyHandle());
            }
        }
        return this;
    }
}
