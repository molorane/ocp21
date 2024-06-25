package com.blessing.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.function.Predicate.not;

interface Util {
    private int getNumbers() {
        return getNumbers3();
    }

    public default int getNumbers2() {
        return getNumbers();
    }

    static int getNumbers3() {
        return 3;
    }

    static int getNumbers1() {
        return getNumbers3();
    }
}

public class Java9AndBeyondVenkat {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    class P {
        final static int r = 9;
    }

    public static void main(String[] args) {

    }

    public static String strip1(String str) {
        return str.strip();
    }

    public static String repeat1(String str) {
        return str.repeat(3);
    }

    public static boolean isBlank1(String str) {
        return str.isBlank();
    }

    public static void negate2() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = e -> e % 2 == 0;
        Predicate<Integer> isGT5 = e -> e > 5;

        numbers.stream()
                .filter(isEven.and(isGT5.negate()))
                .forEach(System.out::println);
    }

    public static void negate1() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEven = e -> e % 2 == 0;
        Predicate<Integer> isGT5 = e -> e > 5;

        numbers.stream()
                .filter(isEven.and(isGT5))
                .forEach(System.out::println);
    }

    public static void negateWithNot() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(not(Java9AndBeyondVenkat::isEven))
                .forEach(System.out::println);
    }

    public static void negate() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        numbers.stream()
                .filter(((Predicate<Integer>) (Java9AndBeyondVenkat::isEven)).negate())
                .forEach(System.out::println);
    }

    public static void var() {
        var var = "Hello";
        System.out.println(var.toUpperCase());
    }

    public static void allMatch() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(
                numbers.stream()
                        //.filter(e -> e > 45)
                        .allMatch(e -> e > 45)
        );
    }

    public static void findFirst() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        System.out.println(
                numbers.stream()
                        .filter(e -> e > 45)
                        .findFirst()
        );
    }

    public static void iterate() {

        // for(seed; [Predicate]; Function)
        IntStream.iterate(0, i -> i <= 15, i -> i + 3)
                .forEach(System.out::println);

        // for(seed; [Predicate]; Function)
        IntStream.iterate(0, i -> i + 3)
                .takeWhile(i -> i <= 20)
                .forEach(System.out::println);
    }

    public static void dropWhile() {

        List<Integer> numbers = Arrays.asList(12, 13, 14, 51, 16, 17, 81, 91);

        System.out.println(
                numbers.stream()
                        .dropWhile(e -> e < 50)
                        .collect(Collectors.toList())
        );
    }

    public static void takeWhile() {

        List<Integer> numbers = Arrays.asList(12, 13, 14, 51, 16, 17, 81, 91);

        System.out.println(
                numbers.stream()
                        .takeWhile(e -> e < 50)
                        .collect(Collectors.toList())
        );
    }

}
