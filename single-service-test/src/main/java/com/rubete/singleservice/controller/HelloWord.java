package com.rubete.singleservice.controller;


import com.rubete.singleservice.core.InvokManager;
import com.rubete.singleservice.core.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.Callable;

@RestController
public class HelloWord {

   /* @Autowired
    private Service service;*/
    @Autowired
    private InvokManager invokManager;
    @RequestMapping("/hello")
    public Object hello(@RequestParam Map<String,Object> map) throws Exception {
        return invokManager.getService().select("userMapper.selectUser", map);

    }
}
