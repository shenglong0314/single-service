package com.rubete.singleservice.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloWord {

    @RequestMapping("/hello")
    public Object hello(Map<String,Object> map){
        return null;
    }
}
