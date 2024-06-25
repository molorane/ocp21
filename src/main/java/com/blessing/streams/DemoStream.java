package com.blessing.streams;

import java.util.Arrays;
import java.util.List;

public class DemoStream {

    public static void print(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //numbers.forEach(Demo::print);

        numbers.stream()
                //.map(e -> e.toString())
                .map(String::valueOf)
                .map(String::toString)
                .forEach(DemoStream::print);
    }

}
