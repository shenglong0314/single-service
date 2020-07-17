package com.rubete.singleservice.core.Fileter;


@FunctionalInterface
public interface IDataFileterFunction<T,R> {
     R filter(T t);
}
