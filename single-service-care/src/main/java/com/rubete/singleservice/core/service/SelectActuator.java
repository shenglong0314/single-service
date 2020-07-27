package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.Parameter;


public class SelectActuator extends AbsServiceActuator {
    @Override
    public Object action(Parameter parameter) {
        return this.getSqlSessionTemplate().selectList(parameter.getId(),parameter.getObj());
    }
}
