package com.blessing.threads.executor;

// This Task class implements Runnable, so its a Thread object
public class Task implements Runnable {
    public void run() {
        System.out.println("Calling Task.run() ");
    }
}