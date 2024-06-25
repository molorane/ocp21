package com.blessing.threads.cyclicbarrier;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Creates a CyclicBarrier object by passing the number of threads and the thread to run
// when all the threads reach the barrier
public class CyclicBarrierTest {

    static CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());

    public static void main(String[] args) {
        // a mixed-double tennis game requires four players;
        // so wait for four players
        // (i.e., four threads) to join to start the game


        System.out.println("Reserving tennis court \n" + "As soon as four players arrive, game will start");
        t2();
    }

    public static void t2() {
        Player2 p = new Player2(barrier, "Joe");
        Player2 p1 = new Player2(barrier, "Dora");
        Player2 p2 = new Player2(barrier, "Tintin");
        Player2 p3 = new Player2(barrier, "Barbie");

        ExecutorService service = Executors.newFixedThreadPool(4);
        service.submit(p);
        service.submit(p1);
        service.submit(p2);
        service.submit(p3);
        service.shutdown();
    }
}