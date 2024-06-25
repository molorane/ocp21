package com.blessing.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemoVenkat {

    public static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 22),
                new Person("Bob", Gender.MALE, 20),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Lerato", Gender.MALE, 72),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jack", Gender.MALE, 3),
                new Person("Jill", Gender.FEMALE, 11)
        );
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> numbers = List.of(1, 2, 3);

        // one to many funcction
        System.out.println(
                getPeople().stream()
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(p -> p.getName().toUpperCase(),
                                        Collectors.flatMapping(name -> Stream.of(name.split("")), Collectors.toSet())))));

    }


    public static void flat() {
        // one to many funcction
        System.out.println(
                getPeople().stream()
                        .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(p -> p.getName().toUpperCase(), Collectors.toSet()))));
    }

    public static void splitting() {
        List<Integer> numbers = List.of(1, 2, 3);

        // one to many funcction
        System.out.println(
                getPeople().stream()
                        .map(Person::getName)
                        .flatMap(name -> Stream.of(name.split("")))
                        .collect(Collectors.toList()));
    }

    public static void oneToMany() {

        List<Integer> numbers = List.of(1, 2, 3);

        // one to one function
        System.out.println(
                numbers.stream()
                        .map(e -> e * 2)
                        .collect(Collectors.toList()));
        // Stream<T>.map(func) => Stream<R>

        // one to many funcction
        System.out.println(
                numbers.stream()
                        .map(e -> List.of(e - 1, e + 1)) // one to many function
                        .flatMap(List::stream)
                        .peek(System.out::println)
                        .collect(Collectors.toList()));
    }

}
