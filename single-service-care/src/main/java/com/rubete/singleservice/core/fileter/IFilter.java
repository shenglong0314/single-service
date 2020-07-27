package com.rubete.singleservice.core.fileter;



public interface IFilter {
    public Boolean before(Object obj);
    public Boolean after(Object obj);
}
