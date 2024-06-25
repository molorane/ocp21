package com.blessing.javapuzzles;

import java.util.stream.Stream;

@SuppressWarnings("all")

public class StreamPuzzle {

    public static void main(String[] args) {

        System.out.println("Stream 1 out put");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .limit(4)
                .map(x -> x * x)
                .peek(System.out::println)
                .count();

        System.out.println();

        System.out.println("Stream 2 out put");
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .map(x -> x * x)
                .peek(System.out::println)
                .count();
    }
}
