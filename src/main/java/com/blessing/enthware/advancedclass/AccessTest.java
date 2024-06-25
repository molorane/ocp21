package com.blessing.enthware.advancedclass;

public class AccessTest {
    String a = "x";
    static char b = 'x';
    String c = "x";

    class Inner {
        String a = "y";

        String get() {
            c = "temp";
            // Line 1
            return c;
        }
    }

    AccessTest() {
        System.out.println(new Inner().get());
    }

    public static void main(String args[]) {
        new AccessTest();
    }
}