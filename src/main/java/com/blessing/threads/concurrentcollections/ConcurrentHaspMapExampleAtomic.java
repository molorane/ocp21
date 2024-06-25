package com.blessing.threads.concurrentcollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrentHaspMapExampleAtomic {

    static Map<String, AtomicInteger> map = new ConcurrentHashMap<>();

    static void processOrder() {
        for (String name : map.keySet()) {
            for (int i = 1; i <= 50; i++) {
                map.get(name).getAndIncrement();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        map.put("Nomfundo", new AtomicInteger());
        map.put("Mothusi", new AtomicInteger());
        map.put("Mahlalela", new AtomicInteger());
        map.put("Molorane", new AtomicInteger());

        int nThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService es = Executors.newWorkStealingPool(nThreads);
        es.submit(ConcurrentHaspMapExampleAtomic::processOrder);
        es.submit(ConcurrentHaspMapExampleAtomic::processOrder);

        es.awaitTermination(1, TimeUnit.SECONDS);
        es.shutdown();

        System.out.println(map);

    }

}
