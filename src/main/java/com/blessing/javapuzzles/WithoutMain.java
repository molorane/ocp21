package com.blessing.javapuzzles;

import java.util.stream.IntStream;

public class WithoutMain {

    static {
        run();
    }

    public static void run() {
        IntStream.range(1, 20)
                .forEach(System.out::println);
    }
}
