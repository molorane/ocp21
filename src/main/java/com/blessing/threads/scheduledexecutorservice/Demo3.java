package com.blessing.threads.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo3 {

    public static void main(String[] args) {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        Runnable r = () -> System.out.println("Task executed");

        ses.scheduleWithFixedDelay(r, 4, 4, TimeUnit.SECONDS);

        Executors.newCachedThreadPool();
    }
}
