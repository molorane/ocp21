package com.blessing.enthware.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceDemo {

    public static void main(String[] args) {
        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("George");
        names.add("Obama");
        String finalvalue = names.stream().reduce(bo).get();
        System.out.println(finalvalue);
    }

}
