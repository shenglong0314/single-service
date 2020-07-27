package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.fileter.FileterManager;

import java.util.ArrayList;
import java.util.List;

public class ExecuteManage {
    private static final ExecuteManage executeManage= new ExecuteManage();
    private List<AbstractHandle> handles=new ArrayList<>();

    public void execute(){

    }

    public static ExecuteManage getExecuteManage() {
        return executeManage;
    }

    public void init(){
        this.handles.add(new FilterHandle(FileterManager.getInstance().getFilters()));
    }
}
