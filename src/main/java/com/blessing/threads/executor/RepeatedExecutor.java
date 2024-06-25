package com.blessing.threads.executor;

import java.util.concurrent.Executor;

// This class implements Executor interface and should override execute(Runnable) method.
// We provide an overloaded execute method with an additional argument 'times' to create and
// run the threads for given number of times
public class RepeatedExecutor implements Executor {

    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() %d times thro' Executor.execute() %n", times);
        for (int i = 0; i < times; i++) {
            execute(runnable);
        }
    }
}