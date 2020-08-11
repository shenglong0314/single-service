package com.rubete.service;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ServiceTest {


        // Future模式计算1到1亿的和
        public static void main(String[] args) throws Exception {
            long start = System.currentTimeMillis();
            ExecutorService executorService = Executors.newCachedThreadPool();
            List<Future<Integer>> futureList = new ArrayList<>();

            // 计算1000次1至1亿的和
            for (int i = 0; i < 100; i++) {
                // 调度执行
                futureList.add(executorService.submit(new Calc()));
            }
            System.out.println("耗时: " + (System.currentTimeMillis() - start));
            for (int i = 0; i < 100; i++) {
                int finalI = i;


               Callable run =  new Callable<Integer>() {
                    @Override
                    public Integer call() throws Exception {
                        Integer    result  = null;
                        try {
                            result= futureList.get(finalI).get();
                            System.out.println(Thread.currentThread().getName()+"第" + finalI + "个结果: " + result);
                            return result;

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (ExecutionException e) {
                            e.printStackTrace();
                        }

                        return null;
                    }
                };

                Object o = executorService.submit(run).get();
                System.out.println("前");
                System.out.println("耗时: " + (System.currentTimeMillis() - start)+"="+o);
                System.out.println("后");

            }
            System.out.println("耗时: " + (System.currentTimeMillis() - start));
        }

        public static class Calc implements Callable<Integer> {

            @Override
            public Integer call() throws Exception {
                return cal(Integer.MAX_VALUE);
            }

            public static int cal (int num) {
                int sum = 0;
                for (int i = 0; i < num; i++) {
                    sum += i;
                }
                return sum;
            }
        }
}
