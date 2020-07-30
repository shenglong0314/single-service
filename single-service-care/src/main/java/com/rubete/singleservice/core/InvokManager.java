package com.rubete.singleservice.core;


import com.rubete.singleservice.core.execute.ExecuteManage;
import com.rubete.singleservice.core.proxy.CglibProxyFactory;
import com.rubete.singleservice.core.service.AbsService;
import com.rubete.singleservice.core.service.Service;
import org.mybatis.spring.SqlSessionTemplate;


public class InvokManager {

    public static final InvokManager invokManager= new InvokManager();


    private ExecuteManage executeManage = new ExecuteManage();

    // private final ProxyFactory factory = new ProxyFactory();
    private final CglibProxyFactory factory = new CglibProxyFactory(new ServiceImpl());


    private SqlSessionTemplate sqlSessionTemplate=null;


    public static InvokManager getInvokManager() {
        return invokManager;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        AbsService.setSqlSessionTemplate(sqlSessionTemplate);
        //InvokService.setSqlSessionTemplate(sqlSessionTemplate);
        this.sqlSessionTemplate = sqlSessionTemplate;

    }

    public Service getService() {
        Service proxyInstance = factory.getProxyInstance();
        //proxyInstance.setSqlSessionTemplate(sqlSessionTemplate);
        return proxyInstance;
    }

    public ExecuteManage getExecuteManage() {
        return executeManage;
    }

    public void setExecuteManage(ExecuteManage executeManage) {
        this.executeManage = executeManage;
    }

}
