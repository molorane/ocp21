package com.blessing.threads.join;

//Creating thread by creating the 
//objects of that class 
class ThreadJoining extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1; i++) {
            try {
                Thread.sleep(5000);
                System.out.println("Demo Thread: " + Thread.currentThread().getName());
            } catch (Exception ex) {
                System.out.println("Exception has" + " been caught" + ex);
            }
        }
    }
}

public class Demo {

    public static void main(String[] args) {
        // creating two threads
        ThreadJoining t1 = new ThreadJoining();
        ThreadJoining t2 = new ThreadJoining();
        ThreadJoining t3 = new ThreadJoining();

        // thread t1 starts
        t1.start();

        // starts second thread after when
        // first thread t1 has died.
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t1.join(2);
        } catch (Exception ex) {
            System.out.println("Exception has " + "been caught" + ex);
        }

        // t2 starts
        t2.start();

        // starts t3 after when thread t2 has died.
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join(9);
        } catch (Exception ex) {
            System.out.println("Exception has been" + " caught" + ex);
        }

        t3.start();
    }

}
