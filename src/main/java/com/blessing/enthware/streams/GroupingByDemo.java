package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDemo {

    Long condition = new Long(1);

    public static void main(List<? extends Number> li) {
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(data.values());
    }

}
