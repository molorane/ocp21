package com.blessing.threads.semaphore;

import java.util.concurrent.Semaphore;

public class Demo {

    private static final Semaphore semaphore = new Semaphore(4);

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new Thread(() -> m("M1")).start();
        new Thread(() -> m("M2")).start();
        new Thread(() -> m("M3")).start();
        new Thread(() -> m("M4")).start();
        new Thread(() -> m("M5")).start();
        new Thread(() -> m("M6")).start();
        new Thread(() -> m("M7")).start();
    }

    public static void m(String str) {

        try {
            semaphore.acquire();
            System.out.println(str + " acquired");

            Thread.sleep(Integer.parseInt(str.charAt(1) + "") * 1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(str + " released");
        semaphore.release();
    }

}
