package com.blessing.ocp8Udemy;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("foo;bar;baz", "", "qux;norf");
        list.stream()
                .flatMap(line -> Arrays.stream(line.split(";")))
                .forEach(str -> System.out.println(str + ":"));
    }

}
