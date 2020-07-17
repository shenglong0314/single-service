package com.rubete.singleservice.controller;


import com.rubete.singleservice.core.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWord {

    @Autowired
    private Service service;

    @RequestMapping("/hello")
    public ResponseEntity hello(@RequestParam Map<String,Object> map){
        Object select = service.select("userMapper.selectUser", map, m -> {
            return m;
        });
        return ResponseEntity.ok(select);
    }
}
