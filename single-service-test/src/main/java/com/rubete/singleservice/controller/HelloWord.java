package com.rubete.singleservice.controller;



import com.rubete.singleservice.core.InvokService;
import com.rubete.singleservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloWord {

    @Autowired
    private InvokService invokService;
    @RequestMapping("/hello")
    public ResponseEntity hello(@RequestParam Map<String,Object> map){

        return invokService.run("userMapper.selectUser",map);
    }
}
