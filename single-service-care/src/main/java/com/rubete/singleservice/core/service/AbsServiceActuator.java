package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.ParameterActuator;
import com.rubete.singleservice.core.execute.IActuator;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.function.Function;

public abstract class AbsServiceActuator implements IActuator {
    private  static SqlSessionTemplate sqlSessionTemplate = null;

    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        AbsServiceActuator.sqlSessionTemplate = sqlSessionTemplate;
    }

    // public abstract Object exec(String id, Object obj, Function fun);

}
