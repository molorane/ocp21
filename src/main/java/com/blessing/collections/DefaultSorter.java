package com.blessing.collections;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DefaultSorter {
    public static void main(String[] args) {
        String[] brics = {"Brazil", "Russia", "India", "China"};
        Arrays.sort(brics, null); // LINE A
        for (String country : brics) {
            System.out.print(country + " ");
        }
        p();

        IntStream.range(0, 4).forEach(System.out::println);
    }

    public static void p() {
        "abracadabra".chars().distinct().peek((ch) -> System.out.printf("%c ", ch)).
                count();
    }
}