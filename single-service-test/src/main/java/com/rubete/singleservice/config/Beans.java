package com.rubete.singleservice.config;



import com.rubete.singleservice.core.Config.InvokConfig;
import com.rubete.singleservice.core.InvokManager;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beans {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    @Bean
    public InvokManager getInvokManager() {
        InvokManager exec = new InvokConfig() {
            @Override
            public InvokManager setSqlSessionTemplate(InvokManager invokManager) {
                invokManager.setSqlSessionTemplate(sqlSessionTemplate);
                return invokManager;
            }
        }.exec();
        SqlSessionTemplate sqlSessionTemplate = exec.getSqlSessionTemplate();
        return exec;
    }
}
