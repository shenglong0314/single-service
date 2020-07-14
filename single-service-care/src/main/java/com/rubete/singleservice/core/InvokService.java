package com.rubete.singleservice.core;

import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;
import java.util.Map;


public class InvokService {

    private SqlSessionTemplate sqlSessionTemplate = InvokManage.getInvokManage().getSqlSessionTemplate();

    public static <R> List<R> run(Class<R> resultClass, Map<String,Object> map){
        List<R> rs = InvokManage.getInvokManage().getSqlSessionTemplate().<R>selectList("userMapper.selectUser",map);

        return rs;
    }
}
