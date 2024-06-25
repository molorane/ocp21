package com.blessing.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeny ", "meeny ", "miny ", "mo ");
        Collections.sort(strings, (str1, str2) -> str1.compareTo(str2));
        strings.forEach(string -> System.out.print(string));
    }
}