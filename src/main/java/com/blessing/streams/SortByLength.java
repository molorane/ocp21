package com.blessing.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();

        words
                .stream()
                .distinct()
                .sorted(lengthCompare)
                .forEach(System.out::println);
    }
}