package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.BasicParameterActuator;
import com.rubete.singleservice.core.Parameter.ParameterActuator;
import com.rubete.singleservice.core.execute.IActuator;


public class SelectActuator extends AbsServiceActuator {
    @Override
    public Object action(IActuator actuator) {
        BasicParameterActuator basi = (BasicParameterActuator)actuator;
        return this.getSqlSessionTemplate().selectList(basi.getId(),basi.getObj());
    }
}
