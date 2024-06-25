package com.blessing.threads.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        CountDownLatch countDownLatch = new CountDownLatch(5);
        executorService.submit(new Service(countDownLatch));
        executorService.submit(new Service(countDownLatch));
        executorService.submit(new Service(countDownLatch));
        executorService.submit(new Service(countDownLatch));
        executorService.submit(new Service(countDownLatch));

        countDownLatch.await();

        System.out.println("All dependent services initialized.");
        executorService.shutdown();

    }

    public static class Service implements Runnable {

        private CountDownLatch latch;

        public Service(CountDownLatch latch) {
            this.latch = latch;
        }

        @Override
        public void run() {
            latch.countDown();
        }

    }

}
