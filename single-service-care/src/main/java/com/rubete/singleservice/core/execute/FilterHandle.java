package com.rubete.singleservice.core.execute;

import com.rubete.singleservice.core.Parameter.DefaultParameter;
import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.fileter.AbstractFilter;
import com.rubete.singleservice.core.fileter.IFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class FilterHandle extends AbstractHandle {
    protected List<AbstractFilter> filters=new ArrayList<>();

    public FilterHandle() {
    }

    public FilterHandle(List<AbstractFilter> filters) {
        this.setOrder(100);
        this.filters = filters;
    }

    public FilterHandle(int order, IHandle handle, List<AbstractFilter> filters) {
        super(order, handle);
        this.filters = filters;
    }

    public FilterHandle(IHandle handle, List<AbstractFilter> filters) {
        super(handle);
        this.setOrder(100);
        this.filters = filters;
    }

    @Override
    public void action(Parameter defaultParameter) {
        if(filters.size()>0 && filters.get(0).before(defaultParameter))
            handle.action(defaultParameter);

        if(filters.size()>0 && filters.get(0).after(defaultParameter));
    }

    public List<AbstractFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<AbstractFilter> filters) {
        this.filters = filters;
    }
}
