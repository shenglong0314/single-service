package com.rubete.singleservice.core;


import com.rubete.singleservice.core.execute.ProxyFactory;
import com.rubete.singleservice.core.service.Service;
import org.mybatis.spring.SqlSessionTemplate;


public class InvokManager {

    public static final InvokManager invokManager= new InvokManager();
    private final ProxyFactory factory = new ProxyFactory();
    private SqlSessionTemplate sqlSessionTemplate=null;


    public static InvokManager getInvokManager() {
        return invokManager;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public Service getService() {
        return factory.getProxyInstance();
    }
}
