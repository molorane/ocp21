package com.blessing.threads;

// This class creates three threads
public class RaceCondition {
    public static void main(String args[]) {
        UseCounter c = new UseCounter();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Counter.count);
    }
}