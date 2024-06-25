package com.blessing.threads.deadlock;

//Counter class has two methods � IncrementBallAfterRun and IncrementRunAfterBall.
//For demonstrating deadlock, we call these two methods in the run method, so that
//locking can be requested in opposite order in these two methods
public class Counter implements Runnable {
    //this method increments runs variable first and then increments the balls variable
//since these variables are accessible from other threads,
//we need to acquire a lock before processing them
    public void IncrementBallAfterRun() {
//since we're updating runs variable first, first lock the Runs.class
        synchronized (Runs.class) {
//lock on Balls.class before updating balls variable
            synchronized (Balls.class) {
                Runs.runs++;
                Balls.balls++;
            }
        }
    }

    public void IncrementRunAfterBall() {
        // since we're updating balls variable first; so first lock Balls.class
        synchronized (Balls.class) {
            // acquire lock on Runs.class before updating runs variable
            synchronized (Runs.class) {
                Balls.balls++;
                Runs.runs++;
            }
        }
    }

    public void run() {
        // call these two methods which acquire locks in different order
        // depending on thread scheduling and the order of lock acquision,
        // a deadlock may or may not arise
        IncrementBallAfterRun();
        IncrementRunAfterBall();
    }
}