package com.blessing.threads;

import java.util.concurrent.locks.ReentrantLock;

// This class implements Runnable interface
// Its run method increments the counter three times
public class UseCounter implements Runnable {

    private ReentrantLock lock = new ReentrantLock();

    public void increment() {
        // increments the counter and prints the value
        // of the counter shared between threads
        synchronized (this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
        }
    }

    public void increment1() {
        lock.lock();
        Counter.count++;
        System.out.print(Counter.count + " ");
        lock.unlock();
    }

    public void run() {
        increment();
        increment();
        increment();
    }
}