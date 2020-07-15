package com.rubete.singleservice.core;



import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

@Repository
public class InvokService {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private ApplicationContext applicationContext;

    public  Object run(String id, Map<String,Object> map){
        Service bean = (Service)applicationContext.getBean(id);
        setParam(bean,map);
        List<Object> objects = sqlSessionTemplate.selectList(id, map);
        return bean.exc(objects);
    }
    public void setParam(Object bean,Map<String,Object> map){
        if(bean instanceof ServiceAbs){
            ServiceAbs  b=(ServiceAbs)bean;
            b.setMap(map);
        }
    }
}
