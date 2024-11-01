package com.blessing.threads.executorservicecallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Define a Callable that returns a value
        Callable<String> task = () -> {
            // Simulate a task
            Thread.sleep(1000); // simulate some delay
            return "Hello from Callable!";
        };

        // Submit the task and get a Future
        Future<String> future = executor.submit(task);

        // Check if the value is present
        try {
            if (future.isDone()) {  // Check if the task is completed
                String result = future.get();  // Get the result
                if (result != null) {
                    // Do something with the result
                    System.out.println("Result: " + result);
                }
            } else {
                System.out.println("Task is not completed yet.");
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
