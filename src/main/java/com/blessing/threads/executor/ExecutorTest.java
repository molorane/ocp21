package com.blessing.threads.executor;

public class ExecutorTest {

    public static void main(String[] args) {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating a Thread");
        Thread thread = new Thread(runnable);
        thread.start();
        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(runnable, 3);
    }

}
