package com.rubete.singleservice.core.service;

import com.rubete.singleservice.core.service.impl.SelectActuator;
import java.util.HashMap;
import java.util.Map;

public class ServiceManage {

    private static final ServiceManage INSTANCE = new ServiceManage();

    private ServiceManage() {
        init();
    }
    private Map<String ,AbsService> services = new HashMap<>();

    public void add (String key ,AbsService service){
        this.services.put(key,service);
    }
    public AbsService getService(String key){
        return this.services.get(key);
    }
    public void init (){
        this.services.put("SELECT",new SelectActuator());
    }

    public static ServiceManage getInstance() {
        return INSTANCE;
    }
}
