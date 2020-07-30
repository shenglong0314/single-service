package com.rubete.singleservice.core.service.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.service.AbsService;
import org.apache.ibatis.mapping.MappedStatement;


public class SelectActuator extends AbsService {
    @Override
    public void action(Parameter parameter) {
        parameter.setData(this.getSqlSessionTemplate().selectList(parameter.getId(),parameter.getObj()));
    }
}
