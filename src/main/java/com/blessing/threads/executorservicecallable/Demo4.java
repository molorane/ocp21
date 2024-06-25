package com.blessing.threads.executorservicecallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo4 {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // TODO Auto-generated method stub

        ExecutorService service = Executors.newFixedThreadPool(4);

        Runnable r = () -> System.out.println(":)");

        Future<? extends Object> future = service.submit(r);

        Object o = future.get();
        System.out.println(o);
        service.shutdown();
    }

}
