package com.rubete.singleservice.core.service;


import java.util.List;
import java.util.function.Predicate;

public interface Service {
    <R> R select(String id, Object obj) throws Exception;

    //<T, R> R select(String id, Object obj, IDataFileterFunction<T,R> fun);

    <R> List<R> selectList(String id, Object obj, Predicate<R> fun);

    Integer insert(String id, Object obj);
    Integer update(String id, Object obj);
    Integer delete(String id, Object obj);
}
