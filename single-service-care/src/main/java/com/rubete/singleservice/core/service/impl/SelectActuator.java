package com.rubete.singleservice.core.service.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.service.AbsService;
import org.apache.ibatis.mapping.MappedStatement;

import java.util.List;


public class SelectActuator extends AbsService {
    @Override
    public Object action(String id,Object parameter) {
        return selectList(id, parameter);
    }
}
