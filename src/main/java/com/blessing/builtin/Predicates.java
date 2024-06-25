package com.blessing.builtin;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Predicates {

    public static void main(String[] args) {
        p1();
    }

    public static void p() {
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));
    }

    public static void p1() {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");
        greeting.removeIf(str -> !str.startsWith("h"));
        greeting.forEach(System.out::println);
    }

    public static void p2() {
        List<String> greeting = new ArrayList<>();
        greeting.add("hello");
        greeting.add("world");
        greeting.removeIf(((Predicate<String>) str -> !str.startsWith("h")).negate());
        greeting.forEach(System.out::println);
    }

}
