package com.rubete.singleservice.core.proxy;


import com.rubete.singleservice.core.service.InvokService;
import com.rubete.singleservice.core.service.Service;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // private IFilter iFilter= new UpdateParam();

    //维护一个目标对象
    private Service target = new InvokService();

    //给目标对象生成代理对象

    public Service getProxyInstance(){
        Object obj = Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new ProxyHander(target)
        );
        return (Service) obj;
    }

}
class ProxyHander implements InvocationHandler {
    Log logger = LogFactory.getLog(this.getClass());
    private Service target =null;
    public ProxyHander(Service target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("开始了");
        //执行目标对象方法
        Object returnValue = method.invoke(target, args);
        logger.info("结束了");
        return returnValue;
    }
}