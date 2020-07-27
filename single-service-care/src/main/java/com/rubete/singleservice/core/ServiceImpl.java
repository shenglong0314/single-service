package com.rubete.singleservice.core;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.service.Service;

import java.util.List;
import java.util.function.Predicate;

public class ServiceImpl implements Service {


     private InvokManager invokManager = InvokManager.getInvokManager();
    @Override
    public Object select(String id, Object obj) {
        Parameter parameter = InvokManager.getInvokManager().getParameterManager().getParmeter().setId(id).setObj(obj);
        InvokManager.getInvokManager().getExecuteManage().execute(parameter);
        return parameter.getData();
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
