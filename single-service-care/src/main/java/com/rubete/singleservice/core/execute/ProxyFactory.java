package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.service.InvokService;
import com.rubete.singleservice.core.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
@Configuration
public class ProxyFactory {

    //维护一个目标对象


    private Service target = new InvokService();

    //给目标对象生成代理对象
    @Bean
    public Service getProxyInstance(){
        Object obj = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始事务2");
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        System.out.println("提交事务2");
                        return returnValue;
                    }
                }
        );
        return (Service) obj;
    }
}
