package com.rubete.singleservice.core.utils;

import java.util.concurrent.atomic.AtomicInteger;

public class OrderUtils {
    private  static   int FILTERORDER  = 500;
    private  static int SERVICEORDER = 500;


    public static int getFilterOrder(){
        return FILTERORDER++;
    }
    public static int getServiceOrder(){
        return SERVICEORDER++;
    }
}
