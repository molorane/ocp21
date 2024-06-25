package com.blessing.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ForEachOrdered {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> db = Collections.synchronizedList(new ArrayList<>());
        IntStream.iterate(1, i -> i + 1).limit(5)
                .parallel()
                //.map(i -> {db.add(i); return i;})
                .forEachOrdered(System.out::print); // p1
        System.out.println();
        db.forEach(System.out::print);
    }

}
