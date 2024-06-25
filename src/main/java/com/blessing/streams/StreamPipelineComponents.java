package com.blessing.streams;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineComponents {
    public static void main(String[] args) {
        Method[] objectMethods = Object.class.getMethods();
        Stream<Method> objectMethodStream = Arrays.stream(objectMethods);
        Stream<String> objectMethodNames = objectMethodStream.map(method -> method.getName());
        Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct();
        uniqueObjectMethodNames.forEach(System.out::println);
        System.out.println();
        p();
        System.out.println(Stream.of(1, 2, 3, 4, 5).count());
    }

    public static void p() {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        strings.stream().forEach(string -> System.out.println(string));
    }
}