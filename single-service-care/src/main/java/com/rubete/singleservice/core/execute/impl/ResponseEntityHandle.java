package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.fileter.AbstractFilter;
import org.springframework.http.ResponseEntity;

public class ResponseEntityHandle extends AbstractHandle {


    public ResponseEntityHandle() {
        this.setOrder(10000);
    }

    public ResponseEntityHandle(int order, IHandle handle) {
        super(order, handle);
    }

    public ResponseEntityHandle(IHandle handle) {
        super(handle);
        this.setOrder(10000);
    }

    @Override
    public void action(Parameter parameter) {
        if(parameter.getData() != null){
            parameter.setData(ResponseEntity.ok(parameter.getData()));
        }
    }
}
