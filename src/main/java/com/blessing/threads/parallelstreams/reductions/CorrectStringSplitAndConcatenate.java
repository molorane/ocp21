package com.blessing.threads.parallelstreams.reductions;

import java.util.Arrays;
import java.util.Optional;

public class CorrectStringSplitAndConcatenate {
    public static void main(String[] args) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Optional<String> originalString = (Arrays.stream(words).parallel().reduce((a, b) -> a + " " + b));
        System.out.println(originalString.get());
    }
}