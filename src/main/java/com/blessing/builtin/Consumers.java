package com.blessing.builtin;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Consumers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        p3();
    }

    public static void p() {
        Stream.of("hello", "world")
                .forEach(System.out::println);
    }

    public static void p1() {
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
    }

    public static void p2() {
        Stream<String> strings = Stream.of("hello", "world");
        Consumer<String> printString = System.out::println;
        strings.forEach(printString);
    }

    public static void p3() {
        Arrays.stream("4, -9, 16".split(","))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);
    }

    public static void p4() {

    }

}
