package com.blessing.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Athlete {
    int stroke = 0;

    public synchronized void swimming() {
        stroke++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String... laps) throws InterruptedException {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for (int i = 0; i < 1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.shutdown();
        s.awaitTermination(4, TimeUnit.SECONDS);
        System.out.print(a.stroke);
    }
}