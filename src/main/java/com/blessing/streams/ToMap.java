package com.blessing.streams;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Stream<String> s = Stream.of("speak", "bark", "meow", "growl");
        BinaryOperator<String> merge = (a, b) -> b + " " + a;
        Map<String, String> map = s.collect(Collectors.toMap(String::toUpperCase, Function.identity()));
        System.out.println(map);
    }

}
