package com.blessing.builtin;

import java.util.Arrays;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        p1();
    }

    public static void p() {
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("supercalifragilisticexpialidocious"));
    }

    public static void p1() {
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> absInt = Math::abs;
        Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
        Arrays.stream("4, -9, 16".split(", "))
                .map(parseAndAbsInt)
                .forEach(System.out::println);

        parseAndAbsInt = absInt.compose(parseInt);
        Arrays.stream("4, -9, 16".split(", "))
                .map(parseAndAbsInt)
                .forEach(System.out::println);
    }

    public static void p2() {

    }

    public static void p3() {

    }

    public static void p4() {

    }
}
