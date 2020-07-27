package com.rubete.singleservice.core.Parameter;

import java.util.HashMap;
import java.util.Map;

public class ParameterManage {
    private Map<String,Parameter> map = new HashMap<>();
    private static final ParameterManage INSTANCE = new ParameterManage();

    public Map<String, Parameter> getMap() {
        return map;
    }

    public void setMap(Map<String, Parameter> map) {
        this.map = map;
    }

    public static ParameterManage getInstance() {
        return INSTANCE;
    }
    public Parameter getParmeter(String key){
        return this.map.get(key);
    }
    public void addParmeter(String key,Parameter value){
        this.map.put(key, value);
    }
    public Parameter getParmeter(){
        return this.map.get("default");
    }

    public void init(){

    }
}
