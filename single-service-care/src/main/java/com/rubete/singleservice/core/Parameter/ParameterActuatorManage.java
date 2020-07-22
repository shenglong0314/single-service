package com.rubete.singleservice.core.Parameter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParameterActuatorManage {
    private Map<String,ParameterActuator> map = new HashMap<>();
    private static final ParameterActuatorManage INSTANCE = new ParameterActuatorManage();
    public ParameterActuatorManage() {
        init();
    }
    public void add(String key, ParameterActuator value){
        map.put(key, value);
    }
    public ParameterActuator get(String key){
        return map.get(key);
    } public ParameterActuator get(){
        return map.get("basic");
    }
    public void init(){
        map.put("basic",new BasicParameterActuator());
    }

    public static ParameterActuatorManage getINSTANCE() {
        return INSTANCE;
    }
}
