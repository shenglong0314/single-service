package com.rubete.singleservice.core;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.ExecuteManage;
import com.rubete.singleservice.core.service.Service;
import com.rubete.singleservice.core.service.impl.SelectActuator;

import java.util.List;
import java.util.function.Predicate;

public class ServiceImpl implements Service {



    private ExecuteManage executeManage = new ExecuteManage();

    @Override
    public Object select(String id, Object obj) {
        Parameter parameter = new Parameter().setId(id).setObj(obj).setService(new SelectActuator());
        executeManage.execute(parameter);
        return parameter.getData()
                ;
    }

    @Override
    public <R> List<R> selectList(String id, Object obj, Predicate<R> fun) {
        return null;
    }

    @Override
    public Integer insert(String id, Object obj) {
        return null;
    }

    @Override
    public Integer update(String id, Object obj) {
        return null;
    }

    @Override
    public Integer delete(String id, Object obj) {
        return null;
    }
}
