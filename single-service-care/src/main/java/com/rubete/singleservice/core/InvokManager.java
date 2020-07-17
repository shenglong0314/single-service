package com.rubete.singleservice.core;


import org.mybatis.spring.SqlSessionTemplate;


public class InvokManager {

    public static final InvokManager invokManager= new InvokManager();
    private SqlSessionTemplate sqlSessionTemplate;


    public static InvokManager getInvokManager() {
        return invokManager;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
