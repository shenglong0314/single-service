package com.rubete.singleservice.core.fileter;


@FunctionalInterface
public interface IDataFileterFunction<T,R> {
     R filter(T t);
}
