package com.blessing.threads.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class InterviewScheduler implements Runnable {

    private BlockingQueue<String> bq;

    public InterviewScheduler(BlockingQueue<String> bq) {
        this.bq = bq;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                String candidate = "Candidate " + i;
                bq.put(candidate);
                System.out.println(candidate + " enter interview room");
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Interview scheduled for all candidates.");
        try {
            bq.put("Complete");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
