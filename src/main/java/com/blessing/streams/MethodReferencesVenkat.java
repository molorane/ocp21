package com.blessing.streams;

import com.blessing.timeit.TimeIt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

enum Gender {
    FEMALE,
    MALE;
}

public class MethodReferencesVenkat {

    public static List<Person> getPeople() {
        return Arrays.asList(
                new Person("Sara", Gender.FEMALE, 20),
                new Person("Sara", Gender.FEMALE, 23),
                new Person("Bob", Gender.MALE, 23),
                new Person("Paula", Gender.FEMALE, 32),
                new Person("Paul", Gender.MALE, 32),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jack", Gender.MALE, 2),
                new Person("Jack", Gender.MALE, 72),
                new Person("Jill", Gender.FEMALE, 12)
        );
    }

    static List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
            12, 13, 14, 15, 16, 17, 18, 19, 20);

    public static void print(Object o) {
        System.out.println(o);
    }

    public static int compute(int i) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        return i * 2;
    }

    public static boolean isGT3(int n) {
        //System.out.println("isGT3 "+n);
        return n > 3;
    }

    public static boolean isEven(int n) {
        //System.out.println("isEven "+n);
        return n % 2 == 0;
    }

    public static int doubleIt(int n) {
        //System.out.println("doubleIt "+n);
        return n * 2;
    }

    public static void main(String[] args) {
        refs1();
    }

    public static void infiniteStream() {
        //System.out.println(Stream.iterate(100, e -> e +1));

        int n = 9;
        System.out.println(
                Stream.iterate(100, e -> e + 1) // unbounded and lazy
                        .filter(e -> e % 2 == 0) // unbounded and lazy
                        .filter(e -> Math.sqrt(e) > 20) // unbounded and lazy
                        .mapToInt(e -> e * 2) // unbounded and lazy
                        .limit(n) // bounded and lazy
                        .sum()); // bounded
    }

    public static void ref11() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 3, 4, 5);

        numbers.stream()
                .filter(MethodReferencesVenkat::isEven)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    public static void ref10() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10, 11,
                12, 13, 14, 15, 16, 17, 18, 19, 20);
        TimeIt.code(() -> {
            int result = 0;
            for (int e : numbers) {
                if (e > 3 && e % 2 == 0) {
                    result = e * 2;
                    break;
                }
            }
            System.out.println(result);
        });

        TimeIt.code(() -> {
            System.out.println(
                    numbers.stream()
                            .filter(MethodReferencesVenkat::isGT3)
                            .filter(MethodReferencesVenkat::isEven)
                            .map(MethodReferencesVenkat::doubleIt)
                            .findFirst()
            );
        });
    }


    public static void ref6() {
        TimeIt.code(() -> {
            System.out.println(
                    // numbers.stream()
                    numbers.parallelStream()
                            .filter(e -> e % 2 == 0)
                            .mapToInt(MethodReferencesVenkat::compute)
                            .sum());
        });
    }

    public static void ref5() {
        Predicate<Integer> p = x -> {
            System.out.println(x);
            return x % 2 == 0;
        };

        System.out.println(
                numbers.stream()
                        .filter(p)
                        .map(e -> e * 2)
                        .reduce(Integer::sum)
                        .get());

        TimeIt.code(() -> {
            System.out.println(
                    numbers.stream()
                            .filter(e -> e % 2 == 0)
                            .mapToInt(e -> e * 2)
                            .sum());
        });
    }

    public static void ref4() {
        System.out.println(
                numbers.stream()
                        .map(String::valueOf)
                        //.reduce("", (c, str) -> c.concat(str)));
                        .reduce("", String::concat));

    }

    public static void refs2() {
        System.out.println(
                numbers.stream()
                        .map(String::valueOf)
                        //.reduce("", (c, str) -> c.concat(str)));
                        .reduce("", String::concat));
    }

    public static void refs1() {
        System.out.println(numbers.stream()
                // .reduce(0, (total, e)-> Integer.sum(total, e))) ;
                // .reduce(0, Integer::sum));
                .reduce(Integer::sum).get());
    }

    public static void refs() {
        numbers.stream()
                // .map(e -> e.toString())
                .map(String::valueOf)
                .map(String::toString)
                .forEach(MethodReferencesVenkat::print);
    }

}
