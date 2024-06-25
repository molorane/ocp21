package com.blessing.enthware.streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalDoubleToString {

    public static void main(String[] args) {
        IntStream is1 = IntStream.range(0, 5); //1
        OptionalDouble x = is1.average(); //2
        System.out.println(x.toString()); //3
    }

}
