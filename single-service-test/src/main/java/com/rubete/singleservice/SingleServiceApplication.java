package com.rubete.singleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication()
@ComponentScan({"com.rubete.singleservice.core","com.rubete.singleservice"})
public class SingleServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SingleServiceApplication.class, args);
    }

}
