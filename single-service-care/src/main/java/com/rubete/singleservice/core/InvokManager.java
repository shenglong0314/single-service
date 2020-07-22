package com.rubete.singleservice.core;


import com.rubete.singleservice.core.Parameter.ParameterActuatorManage;
import com.rubete.singleservice.core.execute.CglibProxyFactory;
import com.rubete.singleservice.core.execute.ProxyFactory;
import com.rubete.singleservice.core.service.AbsServiceActuator;
import com.rubete.singleservice.core.service.InvokService;
import com.rubete.singleservice.core.service.Service;
import com.rubete.singleservice.core.service.ServiceActuatorManage;
import org.mybatis.spring.SqlSessionTemplate;


public class InvokManager {

    public static final InvokManager invokManager= new InvokManager();

    private ServiceActuatorManage serviceManage = ServiceActuatorManage.getINSTANCE();
    private ParameterActuatorManage parameterManager = ParameterActuatorManage.getINSTANCE();

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
        AbsServiceActuator.setSqlSessionTemplate(sqlSessionTemplate);
        //InvokService.setSqlSessionTemplate(sqlSessionTemplate);
        this.sqlSessionTemplate = sqlSessionTemplate;

    }

    public Service getService() {
        Service proxyInstance = factory.getProxyInstance();
        //proxyInstance.setSqlSessionTemplate(sqlSessionTemplate);
        return proxyInstance;
    }

    public ServiceActuatorManage getServiceManage() {
        return serviceManage;
    }

    public void setServiceManage(ServiceActuatorManage serviceManage) {
        this.serviceManage = serviceManage;
    }

    public ParameterActuatorManage getParameterManager() {
        return parameterManager;
    }

    public void setParameterManager(ParameterActuatorManage parameterManager) {
        this.parameterManager = parameterManager;
    }
}
