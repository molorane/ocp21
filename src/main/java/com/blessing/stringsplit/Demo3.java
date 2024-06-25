package com.blessing.stringsplit;

import java.util.*;
import java.util.stream.Collectors;

public class Demo3 {

    // SPLIT

    // spaces as delimeter
    // split("\\s+"), split("[]+"), split("[ ]s+");

    public static void main(String[] args) {
        //Stream<String> s = Pattern.compile("[^a-zA-Z0-9]+").splitAsStream("the#man! in)the_moon");

        List<String> list = List.copyOf(Arrays.asList("tough#!but)amazing_is~Java11".split("[^a-zA-Z0-9]+")));

        ListIterator<? extends String> iter = list.listIterator(list.size());

        Collection<String> list2 = new LinkedList<>();

        while (iter.hasPrevious()) {
            list2.add(iter.previous());
        }

        list2.stream()
                .filter(str -> !str.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

}
