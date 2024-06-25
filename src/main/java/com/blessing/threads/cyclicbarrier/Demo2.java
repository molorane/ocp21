package com.blessing.threads.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyTask implements Runnable {

    CyclicBarrier barrier;

    public MyTask(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            System.out.println("Arrived");
            barrier.await(10, TimeUnit.SECONDS); //barrier.await();
            // barrier.await(10, TimeUnit.MINUTES); the timeout required for all threads to reach the barrier
            System.out.println(":)");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

//The run() method in this thread should be called only when
//four players are ready to start the game
class StartGame implements Runnable {
    public void run() {
        System.out.println("All four players ready, game starts");
    }
}

public class Demo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ExecutorService service = Executors.newFixedThreadPool(4);
        CyclicBarrier barrier = new CyclicBarrier(4, new StartGame());

        MyTask t1 = new MyTask(barrier);

        service.submit(t1);
        service.submit(t1);
        service.submit(t1);
        service.submit(t1);

        service.shutdown();
    }

}
