package com.blessing.enthware.withoutblocking;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultWithoutBlockingExample {

    public static void main(String[] args) throws Exception {
        // create a thread pool of two threads
        ExecutorService es = Executors.newFixedThreadPool(2);

        MyTask task1 = new MyTask();
        MyTask task2 = new MyTask();
        Future<String> result = es.submit(task1);
        Future<String> result1 = es.submit(task2);
        System.out.println("Proceeding without blocking... ");
        while (!result.isDone()) {
            try {
                // check later
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Result is " + result.get());
        System.out.println("Result is " + result1.get());
        es.shutdown();
    }

    public static class MyTask implements Callable<String> {
        public String call() {
            try {
                // simulate a long running task;
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            return "Data from " + Thread.currentThread().getName();
        }
    }
}
