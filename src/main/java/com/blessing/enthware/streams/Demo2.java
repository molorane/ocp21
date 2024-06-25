package com.blessing.enthware.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

    public static void main(String[] args) {
        Stream<Integer> strm1 = Stream.of(2, 3, 5, 7, 11, 13, 17, 19); //1
        //Stream<Integer> strm2 = strm1.filter(i->{ return i>5 && i<15; });  //2
        //Stream<Integer> strm3 = strm1.filter(i -> i>5).filter(i -> i<15);
        //strm2.forEach(System.out::print); //3
        //strm3.forEach(System.out::print); //4
        List<Integer> strm2 = strm1.collect(Collectors.partitioningBy(i -> {
            return i > 5 && i < 15;
        })).get(false);
        System.out.println(strm2);
    }

}
