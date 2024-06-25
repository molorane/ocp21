package com.blessing.enthware.streams;

import java.util.Random;
import java.util.stream.DoubleStream;

public class RandomStreams {

    public static void main(String[] args) {
        Random r = new Random();
        //r.doubles(10).forEach(System.out::println);
        //r.doubles(10).map(x->Math.round(x)).forEach(System.out::println);
        DoubleStream rDoubles = r.doubles().limit(10);
        rDoubles.forEach(System.out::println);

        DoubleStream.generate(() -> r.nextDouble()).limit(10).forEach(System.out::print);
    }

}
