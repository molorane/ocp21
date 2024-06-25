package com.blessing.enthware.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        int[][] ia = {{1, 2}, {3, 4}, {5, 6}};

        long count = Stream.of(ia).flatMapToInt(IntStream::of)
                .map(i -> i + 1).filter(i -> i % 2 != 0).peek(System.out::print).count();
        System.out.println(count);
    }

}
