package com.rubete.singleservice.core.service;

import java.util.HashMap;
import java.util.Map;

public class ServiceActuatorManage {
    private static final ServiceActuatorManage INSTANCE = new ServiceActuatorManage();
    private Map<String,AbsServiceActuator> map = new HashMap<>();

    public ServiceActuatorManage() {
        init();
    }
    public void add(String key, AbsServiceActuator value){
        map.put(key, value);
    }
    public AbsServiceActuator get(String key){
        return map.get(key);
    } public AbsServiceActuator get(){
        return map.get("select");
    }
    public void init(){
        map.put("select",new SelectActuator());
    }

    public static ServiceActuatorManage getInstance() {
        return INSTANCE;
    }
}
