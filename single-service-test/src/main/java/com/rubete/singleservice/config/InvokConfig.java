package com.rubete.singleservice.config;



import com.rubete.singleservice.core.Config;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class InvokConfig{
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Bean
    public Config processEngineConfigurationConfigurer()
    {
        Config config = new Config();
        config.getInvokMange().setSqlSessionTemplate(sqlSessionTemplate);
        return config;
    }
}
