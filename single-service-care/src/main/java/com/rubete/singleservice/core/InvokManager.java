package com.rubete.singleservice.core;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvokManager {

    @Autowired
    private InvokService invokService;
}
