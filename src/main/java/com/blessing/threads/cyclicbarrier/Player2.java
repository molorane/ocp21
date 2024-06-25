package com.blessing.threads.cyclicbarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

// This thread simulates arrival of a player.
// Once a player arrives, he/she should wait for other players to arrive
public class Player2 extends Thread {
    CyclicBarrier waitPoint;

    public Player2(CyclicBarrier barrier, String name) {
        this.setName(name);
        waitPoint = barrier;
    }

    public void run() {
        System.out.println("Player " + getName() + " is ready ");
        try {
            waitPoint.await(); // await for all four players to arrive
        } catch (BrokenBarrierException | InterruptedException exception) {
            System.out.println("An exception occurred while waiting... " + exception);
        }
    }
}