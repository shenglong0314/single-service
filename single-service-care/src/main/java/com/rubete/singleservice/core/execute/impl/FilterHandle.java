package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.annotation.Handle;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.fileter.FileterManager;
import com.rubete.singleservice.core.fileter.IFilter;
import com.rubete.singleservice.core.utils.OrderUtils;


@Handle(500)
public class FilterHandle extends AbstractHandle {
    protected IFilter filter = null;

    public FilterHandle() {
        this.setOrder(OrderUtils.getFilterOrder());
        FileterManager fileterManager = new FileterManager();
        filter = fileterManager.getFilter();
    }

    public FilterHandle(IFilter filter) {
        this();
        this.filter = filter;
    }

    public FilterHandle(int order, IFilter filter) {
        this(filter);
        this.order = order;
    }

    public FilterHandle(int order) {
        this();
        this.order = order;
    }

    @Override
    public void action(Parameter parameter) {

        if (!filter.before(parameter)) return;
        handle.action(parameter);
        if (!filter.after(parameter)) return;

    }

}
