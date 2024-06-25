package com.blessing.threads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Demo {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        executorService.submit(new Service(cyclicBarrier));
        executorService.submit(new Service(cyclicBarrier));
        executorService.submit(new Service(cyclicBarrier));

    }

    public static class Service implements Runnable {

        private final CyclicBarrier barrier;

        public Service(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            try {
                //barrier.reset();
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }

            System.out.println("All threads..");
        }

    }
}
