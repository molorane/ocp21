package com.blessing.interview;

import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        final String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
        NumberRangeSummarizer numberRangeSummarizer = new NumberRangeSummarizerImpl();
        Collection<Integer> list = numberRangeSummarizer.collect(input);
        String collectionSummary = numberRangeSummarizer.summarizeCollection(list);
        System.out.println(collectionSummary);
    }
}
