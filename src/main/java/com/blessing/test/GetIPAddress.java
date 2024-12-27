package com.blessing.test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIPAddress {
    public static void main(String[] args) {
        B be = new B();
        be.test();
    }


    public static class A {

        public void test() {
            System.out.println("Tests in A");
        }
    }

    public static class B extends A {
        public void test() {
            super.test();
        }
    }
}
