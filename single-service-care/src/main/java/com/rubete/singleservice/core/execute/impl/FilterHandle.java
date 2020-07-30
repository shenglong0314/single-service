package com.rubete.singleservice.core.execute.impl;

import com.rubete.singleservice.core.Parameter.Parameter;
import com.rubete.singleservice.core.execute.AbstractHandle;
import com.rubete.singleservice.core.execute.IHandle;
import com.rubete.singleservice.core.fileter.FileterManager;
import com.rubete.singleservice.core.fileter.IFilter;
import com.rubete.singleservice.core.utils.OrderUtils;


public class FilterHandle extends AbstractHandle {
    protected IFilter filter=null;

    public FilterHandle() {
        FileterManager fileterManager = new FileterManager();
        filter = fileterManager.getFilter();
    }

    public FilterHandle(IFilter filters) {
        this.setOrder(OrderUtils.getFilterOrder());
        this.filter = filters;
    }

    public FilterHandle(int order, IHandle handle, IFilter filter) {
        super(order, handle);
        this.filter = filter;
    }

    public FilterHandle(IHandle handle, IFilter filter) {
        super(handle);
        this.setOrder(OrderUtils.getFilterOrder());
        this.filter = filter;
    }

    @Override
    public void action(Parameter parameter) {

          if(!filter.before(parameter))return;
            handle.action(parameter);
          if(!filter.after(parameter))return;

    }

}
