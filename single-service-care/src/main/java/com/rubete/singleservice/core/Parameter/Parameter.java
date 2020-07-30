package com.rubete.singleservice.core.Parameter;


import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.fileter.IFilter;
import com.rubete.singleservice.core.service.AbsService;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.function.Predicate;

@Data
@Accessors(chain = true)
public class Parameter {
    private String id;
    private Object obj;
    private Object data;
    private Predicate fun;
    private AbsService service;
    private IFilter filter;
}
