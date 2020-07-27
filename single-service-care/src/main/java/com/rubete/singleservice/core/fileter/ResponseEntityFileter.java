package com.rubete.singleservice.core.fileter;

import org.springframework.http.ResponseEntity;

public class ResponseEntityFileter extends AbstractFilter {
    @Override
    public Boolean beforeFileter(Object obj) {
        return null;
    }

    @Override
    public Boolean afterFileter(Object obj) {
        obj = ResponseEntity.ok(obj);
        return true;
    }
}
