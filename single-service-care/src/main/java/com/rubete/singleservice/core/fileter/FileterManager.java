package com.rubete.singleservice.core.fileter;

import com.rubete.singleservice.core.execute.FilterHandle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileterManager {
    private static final FileterManager INSTANCE = new FileterManager();
    private List<AbstractFilter> filters = new ArrayList<>();

    public FileterManager() {
        this.init();
    }

    public static FileterManager getInstance() {
        return INSTANCE;
    }
    public void init(){
        this.filters.add(new ResponseEntityFileter());
        this.orderFilter();

    }
    public FileterManager addFilter(AbstractFilter filter){
        this.filters.add(filter);
        return this;
    }
    public FileterManager removeFilter(AbstractFilter filter){
        this.filters.remove(filter);
        return this;
    }
    public FileterManager removeFilter(int index){
        this.filters.remove(index);
        return this;
    }
    public FileterManager orderFilter(){
        Collections.sort(this.filters);
        for(int i = 0;i < this.filters.size();i++){
            if(i+1 < this.filters.size()){
                this.filters.get(i).setNext(this.filters.get(i+1));
            }else {
                this.filters.get(i).setNext(new EmptyFilter());
            }
        }

        return this;
    }

    public List<AbstractFilter> getFilters() {
        return filters;
    }

    public void setFilters(List<AbstractFilter> filters) {
        this.filters = filters;
    }
}
