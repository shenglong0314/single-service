package com.rubete.singleservice.core.fileter;

import com.rubete.singleservice.core.Parameter.Parameter;
import org.springframework.http.ResponseEntity;

public class ResponseEntityFileter extends AbstractFilter {
    @Override
    public Boolean beforeFileter(Parameter obj) {
        return true;
    }

    @Override
    public Boolean afterFileter(Parameter obj) {
        obj.setData(ResponseEntity.ok(obj.getData()));
        return true;
    }
}
