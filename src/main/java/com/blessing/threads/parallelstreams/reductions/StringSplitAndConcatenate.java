package com.blessing.threads.parallelstreams.reductions;

import java.util.Arrays;

class StringConcatenator {
    public static String result = "";

    public static void concatStr(String str) {
        result = result + " " + str;
    }
}

public class StringSplitAndConcatenate {
    public static void main(String[] args) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Arrays.stream(words).forEach(StringConcatenator::concatStr);
        System.out.println(StringConcatenator.result);

        Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);
        System.out.println();
    }
}