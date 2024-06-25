package com.blessing.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class NumberRangeSummarizerImpl implements NumberRangeSummarizer {

    @Override
    public List<Integer> collect(String input) {
        return Arrays.stream(input.split(","))
                .map(Integer::valueOf)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // Sample Input: "1,3,6,7,{8,12},13,14,{15,21},22,23,24,31
    // Result: "1, 3, 6-8, 12-15, 21-24, 31"
    @Override
    public String summarizeCollection(Collection<Integer> input) {

        final StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>(input);

        for (int i = 0; i < list.size(); i++) {

            String firstForRange = list.get(i).toString();
            boolean foundRange = false;

            for (int j = i; j < list.size() - 1; j++) {

                while (foundRange) {
                    if (list.get(j) + 1 != list.get(j + 1)) {
                        sb.append(String.format("%s-%s, ", firstForRange, list.get(j)));
                        foundRange = false;
                        System.out.printf("[%s]%s-%s%n", j, list.get(j), list.get(j + 1));
                        i = j + 1;
                        break;
                    }
                    j++;
                }

                //System.out.printf("%s-%s%n", list.get(j), list.get(j+1));
                if (list.get(j) + 1 == list.get(j + 1)) {
                    foundRange = true;
                } else {
                    sb.append(String.format("%s, ", list.get(i)));
                    break;
                }
            }
        }

        return sb.toString();
    }
}
