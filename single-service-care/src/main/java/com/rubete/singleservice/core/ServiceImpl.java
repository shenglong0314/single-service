package com.rubete.singleservice.core;

import com.rubete.singleservice.core.service.Service;

import java.util.List;
import java.util.function.Predicate;

public class ServiceImpl implements Service {

    @Override
    public Object select(String id, Object obj) {
        InvokManager.getInvokManager().getParameterManager().getParmeter().setId(id).setObj(obj);
        return null;
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
