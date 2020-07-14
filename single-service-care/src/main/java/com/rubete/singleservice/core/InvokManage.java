package com.rubete.singleservice.core;

import org.mybatis.spring.SqlSessionTemplate;

import javax.sql.DataSource;

public class InvokManage {
    private static final InvokManage invokManage = new InvokManage();
    private InvokManage(){};

    public static InvokManage getInvokManage() {
        return invokManage;
    }

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

}
