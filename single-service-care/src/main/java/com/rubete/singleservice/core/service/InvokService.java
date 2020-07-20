package com.rubete.singleservice.core.service;


import com.rubete.singleservice.core.Fileter.IDataFileterFunction;
import com.rubete.singleservice.core.InvokManager;
import org.mybatis.spring.SqlSessionTemplate;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class InvokService implements Service {

    public SqlSessionTemplate sqlSessionTemplate = null;
    public InvokService(){
        sqlSessionTemplate= InvokManager.getInvokManager().getSqlSessionTemplate();
    }
    public <R>R select(String id, Object param) {
        R ts = (R) sqlSessionTemplate.selectList(id, param);
        return ts;
    }


    public <T,R> R select(String id, Object param, IDataFileterFunction<T,R> fun) {
        T ts = (T) sqlSessionTemplate.selectList(id, param);
        R filter = fun.filter(ts);
        return filter;
    }

  /* public <T,R> R select(String id, Object param, Function<T,R> fun) {
        T ts = (T) sqlSessionTemplate.selectList(id, param);
        R apply = fun.apply(ts);
        return apply;
    }*/


    public <R>List<R> selectList(String id, Object obj, Predicate<R> fun) {
        List<R> ts = sqlSessionTemplate.selectList(id, obj);
        List<R> collect = ts.stream().filter(fun).collect(Collectors.toList());
        return collect;
    }


    public Integer insert(String id, Object obj) {
        int insert = sqlSessionTemplate.insert(id, obj);
        return insert;
    }

    public Integer update(String id, Object obj) {
        int update = sqlSessionTemplate.update(id, obj);
        return update;
    }

    public Integer delete(String id, Object obj) {
        int delete = sqlSessionTemplate.delete(id, obj);
        return delete;
    }

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }
}
