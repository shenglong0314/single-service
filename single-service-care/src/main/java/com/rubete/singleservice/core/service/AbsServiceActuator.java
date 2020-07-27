package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.Parameter;
import org.mybatis.spring.SqlSessionTemplate;

public abstract class AbsServiceActuator {
    private  static SqlSessionTemplate sqlSessionTemplate = null;

    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }
    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        AbsServiceActuator.sqlSessionTemplate = sqlSessionTemplate;
    }
    public abstract Object action(Parameter parameter);

}
