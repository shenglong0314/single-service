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


    protected  Object insert(String id,Object param){
        return this.sqlSessionTemplate.insert(id,param);
    }
    protected  Object update(String id,Object param){
        return this.sqlSessionTemplate.update(id,param);
    }
    protected  Object selectList(String id,Object param){
        return this.sqlSessionTemplate.selectList(id,param);
    }
    protected  Object selectOne(String id,Object param){
        return this.sqlSessionTemplate.selectOne(id,param);
    }
    protected  Object delete(String id,Object param){
        return this.sqlSessionTemplate.delete(id,param);
    }

    public abstract Object action(String id,Object parameter);
}
