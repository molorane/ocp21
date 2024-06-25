package com.blessing.threads.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcurrentHaspMapExample {

    static Map<String, Integer> map = new ConcurrentHashMap<>();

    static void processOrder() {
        for (String name : map.keySet()) {
            for (int i = 1; i <= 50; i++) {
                int keyValue = map.get(name);
                map.put(name, keyValue + 1);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("Nomfundo", 1);
        map.put("Mothusi", 1);
        map.put("Mahlalela", 1);
        map.put("Molorane", 1);

        int nThreads = Runtime.getRuntime().availableProcessors();
        System.err.println(nThreads);
        ExecutorService es = Executors.newWorkStealingPool(nThreads);
        es.submit(ConcurrentHaspMapExample::processOrder);
        es.submit(ConcurrentHaspMapExample::processOrder);

        es.awaitTermination(1, TimeUnit.SECONDS);
        es.shutdown();

        System.out.println(map);

    }

}
