package com.blessing.biversions;

import java.util.function.BiFunction;

public class BIs {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BiFunction<String, Long, String> concatStr = (x, y) -> x + y;
        System.out.println(concatStr.apply("hello ", 9l));
        // prints: hello world
    }

}
