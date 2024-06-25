package com.blessing.enthware.oop;

class A {
    int fi = 10;
}

interface B {
    default void p() {
        x();
    }

    static void x() {
        Byte b = 9;
    }
}

public class Demo1 extends A {

    int fi = 15;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Demo1 b = new Demo1();
        b.fi = 20;
        System.out.println(b.fi);
        System.out.println(((A) b).fi);
    }

}
