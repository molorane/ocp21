package com.blessing.threads.questions;

public class Demo extends Thread {
    public void run() {
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("ping");
    }

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        Thread pingPong = new Demo();
        pingPong.start();
        pingPong.join();
        Thread.sleep(1000);
        System.out.println("pong");
        System.out.println("pong");
        System.out.println("pong");
        System.out.println("pong");

    }

}
