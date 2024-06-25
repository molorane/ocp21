package com.blessing.enthware.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PartitioningByDemo {

    public static void main(String[] args) {
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1
        //Object obj = values.collect(Collectors.partitioningBy(x->x%2==0)); //2
        //System.out.println(obj);

        Map<Boolean, List<Integer>> map = values.collect(Collectors.partitioningBy(x -> x % 2 == 0)); //2

        System.out.println(map);
    }

}
