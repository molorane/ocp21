package com.blessing.threads.parallelstreams.reductions;

import java.util.Arrays;

public class StringSplitAndConcatenateParallel {
    public static void main(String[] args) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);
        System.out.println(StringConcatenator.result);
    }
}