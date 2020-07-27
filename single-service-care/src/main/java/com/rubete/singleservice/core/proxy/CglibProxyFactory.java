package com.rubete.singleservice.core.proxy;



import com.rubete.singleservice.core.service.Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    Log logger = LogFactory.getLog(this.getClass());
    private Service target =null;

    public CglibProxyFactory(Service target) {
        this.target = target;
    }


    public Service getProxyInstance(){
        //1.工具类
        Enhancer en = new Enhancer();
        //2.设置父类
        en.setSuperclass(target.getClass());
        //3.设置回调函数
        en.setCallback(this);
        //4.创建子类(代理对象)
        return (Service)en.create();

    }
    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        logger.info("开始事务...");
        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);

        logger.info("提交事务...");
        return returnValue;
    }
}
