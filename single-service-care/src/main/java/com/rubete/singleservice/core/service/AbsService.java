package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.Parameter.Parameter;
import org.apache.ibatis.mapping.MappedStatement;
import org.mybatis.spring.SqlSessionTemplate;

public abstract class AbsService {
    private static SqlSessionTemplate sqlSessionTemplate = null;

    public static SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public static void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        AbsService.sqlSessionTemplate = sqlSessionTemplate;
    }


    public static   String getType(String id){
        MappedStatement mappedStatement = getSqlSessionTemplate().getConfiguration().getMappedStatement(id);
        return mappedStatement.getSqlCommandType().toString();
    }

    public abstract void action(Parameter parameter);
}
