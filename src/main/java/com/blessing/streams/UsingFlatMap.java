package com.blessing.streams;

import java.util.Arrays;
import java.util.List;

public class UsingFlatMap {
    public static void main(String[] args) {
        List<List<Integer>> intsOfInts =
                Arrays.asList(
                        Arrays.asList(1, 3, 5),
                        Arrays.asList(2, 4));

        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
                .map(i -> i * i)
                .sorted()
                .forEach(System.out::println);
    }
}