package com.rubete.singleservice.config;



import com.rubete.singleservice.core.Config.InvokConfig;
import com.rubete.singleservice.core.InvokManager;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Beans extends InvokConfig {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Bean
    public InvokManager setSqlSessionTemplate(InvokManager invokManager) {
        invokManager.setSqlSessionTemplate(sqlSessionTemplate);
        return invokManager;
    }
}
