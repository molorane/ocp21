package com.blessing.enthware.streams;

import java.util.stream.DoubleStream;

public class DoubleStreamDemo {

    public static void main(String[] args) {
        DoubleStream is = DoubleStream.of(0, 2, 4);
        double sum = is.filter(i -> i % 2 == 0).sum();
        System.out.println(sum); // 3

        double d = 0, d1 = 2, d2 = 4;
        System.out.println(d % 2);
        System.out.println(d1 % 2);
        System.out.println(d2 % 2);
        System.err.println(0 == 0.000);
    }

}
