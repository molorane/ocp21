package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class CollectorsJoining2 {

    public static void main(String[] args) {
        List<String> letters = Arrays.asList("j", "a", "v", "a");
        System.out.print(letters.stream().collect(Collectors.joining(",", "[", "]")).toUpperCase());
    }

}
