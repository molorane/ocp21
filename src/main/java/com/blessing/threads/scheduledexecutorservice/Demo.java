package com.blessing.threads.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();

        Runnable r = () -> System.out.println("Task executed");

        ses.schedule(r, 1, TimeUnit.SECONDS);
        ses.shutdown();
    }
}
