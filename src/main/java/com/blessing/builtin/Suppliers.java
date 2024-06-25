package com.blessing.builtin;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.LongPredicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Suppliers {

    public static void main(String[] args) {
        p2();
        LongPredicate ip;
    }

    public static void p() {
        Random random = new Random();
        Stream.generate(random::nextBoolean)
                .limit(4)
                .forEach(System.out::println);
    }

    public static void p1() {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
    }

    public static void p2() {
        Supplier<String> newString = String::new;
        System.out.println(newString.get());
    }
}
