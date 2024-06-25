package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;

public class PassImmutableObject {

    public static void main(String[] args) {
        List<StringBuilder> dList = Arrays.asList(new StringBuilder("a"), new StringBuilder("aa"));
        dList.stream().forEach(x -> x.append("b"));
        dList.stream().forEach(x -> System.out.println(x));
    }

}
