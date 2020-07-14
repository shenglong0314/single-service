package com.rubete.singleservice.core;


import org.mybatis.spring.SqlSessionTemplate;

public class Config {
    private InvokManage invokMange = InvokManage.getInvokManage();


    public Config(SqlSessionTemplate sqlSessionTemplate){
        invokMange.setSqlSessionTemplate(sqlSessionTemplate);
    }



}
