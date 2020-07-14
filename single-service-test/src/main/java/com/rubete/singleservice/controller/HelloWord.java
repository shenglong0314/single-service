package com.rubete.singleservice.controller;


import com.rubete.singleservice.core.InvokService;
import com.rubete.singleservice.empty.SysUser;
import com.rubete.singleservice.mapper.UserMapper;
import org.apache.ibatis.type.Alias;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class HelloWord {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @RequestMapping("/hello")
    public Object hello(Map<String,Object> map){
        List<Object> objects = sqlSessionTemplate.selectList("userMapper.selectUser", map);
        List<SysUser> run = InvokService.run(SysUser.class, map);

        //List<SysUser> sysUsers = userMapper.selectUser();
        return "";
    }
}
