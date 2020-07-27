package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.DefaultParameter;
import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.fileter.FileterManager;
import com.rubete.singleservice.core.service.ServiceActuatorManage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecuteManage {
    private static final ExecuteManage executeManage= new ExecuteManage();
    private final List<AbstractHandle> handles=new ArrayList<>();

    public ExecuteManage() {
        this.init();
    }

    public void execute(Parameter defaultParameter){
        handles.get(0).action(defaultParameter);
    }
    public static ExecuteManage getExecuteManage() {
        return executeManage;
    }

    private void init(){
        this.handles.add(new FilterHandle(FileterManager.getInstance().getFilters()));
        this.handles.add(new ServiceHandle(ServiceActuatorManage.getInstance().get()));
        this.order();
    }

    private ExecuteManage order(){
        Collections.sort(this.handles);
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
