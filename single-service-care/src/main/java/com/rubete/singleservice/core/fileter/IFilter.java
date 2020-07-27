package com.rubete.singleservice.core.fileter;


import com.rubete.singleservice.core.Parameter.Parameter;

public interface IFilter {
    public Boolean before(Parameter obj);
    public Boolean after(Parameter obj);
}
