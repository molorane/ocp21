package com.blessing.udemytest;

import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Pets {Cat, Dog, Parrot, Chameleon};

public class Demo {

    public static void main(String[] args) {
        Stream<String> words = Stream.of("eeny", "meeny", "miny", "mo");
        // LINE_ONE
        String boxedString = words.collect(Collectors.joining(", ", "[", "]"));
        // LINE_TWO
        System.out.println(boxedString);
    }
}
