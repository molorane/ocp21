package com.blessing.advanceclassdesign.innerclasses;

public class IkmTest {

    private int data;

    public IkmTest() {
        this(10);
    }

    public IkmTest(int data) {
        this.data = data;
    }

    public void display() {
        class Decrementer {

            public void decrement() {
                data--;
            }
        }

        Decrementer d = new Decrementer();
        d.decrement();
        System.out.println("data = " + data);
    }

    public static void main(String[] args) {
        // TODO Nomfundo Millicent
        int data = 0;
        IkmTest t = new IkmTest();
        t.display();
        System.out.println("data = " + data);
    }

}
