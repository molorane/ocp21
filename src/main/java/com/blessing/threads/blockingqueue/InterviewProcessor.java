package com.blessing.threads.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewProcessor implements Runnable {

    private BlockingQueue<String> bq;

    public InterviewProcessor(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        try {
            String candidate;
            Thread.sleep(1000);
            while (!(candidate = bq.take()).equalsIgnoreCase("complete")) {
                System.out.println("*** " + candidate + " interviewed ***");
                Thread.sleep(1000);
            }
            System.out.println("All candidates interviewed.");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
