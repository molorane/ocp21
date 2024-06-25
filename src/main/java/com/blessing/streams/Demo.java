package com.blessing.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(l.stream().mapToInt(x -> x).sum());
        p1();
    }

    public static void p1() {

        List<String> l = Arrays.asList("A", "B", "C", "D");
        long count = l.stream().peek(System.out::println).count();
        System.out.println(count);

        "abracadabra".chars().distinct().peek(ch ->
                System.out.printf("%c ", ch)).sorted();
    }

    public static void p2() {
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }

    public static void p3() {
        List<String> people =
                Arrays.asList("Nomfundo", "Molorane", "Mothusi", "Felleng");

        people
                .stream()
                .map(String::toLowerCase)
                .filter(x -> x.startsWith("m"))
                .forEach(System.out::println);
    }

    public static void p4() {
        try (Stream<String> bands = Files.lines(Paths.get("bands.txt"))) {
            bands
                    .sorted()
                    .filter(x -> x.length() > 6)
                    .forEach(System.out::println);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void p5() {
        try {
            List<String> bands =
                    Files.lines(Paths.get("bands.txt"))
                            .filter(x -> x.contains("a"))
                            .collect(Collectors.toList());

            bands.forEach(System.out::println);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void p6() {
        try {
            long count = Files.lines(Paths.get("data.txt"))
                    .map(x -> x.split(","))
                    .filter(y -> y.length > 1)
                    .count();

            System.out.println(count);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void p7() {
        try {
            Files.lines(Paths.get("data.txt"))
                    .map(x -> x.split(","))
                    .filter(y -> y.length > 1)
                    .map(x -> Arrays.asList(x[0], Math.round(Float.parseFloat(x[1])) + "", x[2]))
                    .forEach(y -> System.out.println(y.get(0) + " " + y.get(1) + " " + y.get(2)));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void p8() {
        try {
            Map<String, Integer> map = new HashMap<>();

            map =
                    Files.lines(Paths.get("data.txt"))
                            .map(x -> x.split(","))
                            .filter(y -> y.length > 1)
                            .map(x -> Arrays.asList(x[0], Math.round(Float.parseFloat(x[1])) + "", x[2]))
                            .collect(Collectors.toMap(a -> a.get(0), a -> Integer.valueOf(a.get(1))));
            System.out.println(map);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void p9() {

        Stream.of(1, 2, 3, 4, 5, 6)
                .limit(4)
                .map(i -> i * i)
                .peek(System.out::println)
                .count();

        System.out.println("=");

        LongStream.of(1, 2, 3, 4, 5, 6)
                .map(i -> i * i)
                .peek(System.out::println)
                .count();
    }

    public static void p() {
        IntStream s = IntStream.range(1, 6);
        s.map(i -> i * i).forEach(i -> System.out.print(i + " "));
        System.out.println();
        IntStream s1 = IntStream.iterate(2, i -> i + 1).limit(5);
        s1.forEach(i -> System.out.print(i + " "));
    }

}
