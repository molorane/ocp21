package com.blessing.threads.writelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Demo {

    static int n;
    static ReadWriteLock lock = new ReentrantReadWriteLock();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        increment();
        increment();
        get();
        System.out.println(n);
    }

    public static void increment() {
        try {
            lock.writeLock().lock();
            n++;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static int get() {
        try {
            lock.readLock().lock();
            return n;
        } finally {
            lock.readLock().unlock();
        }
    }

}
