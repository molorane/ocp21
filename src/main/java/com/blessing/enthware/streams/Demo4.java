package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

    public static void main(String[] args) {
        List<String> values = Arrays.asList("Alpha A", "Alpha B", "Alpha C");

        //INSERT CODE HERE

        boolean flag = values.stream().allMatch(str -> str.equals("Alpha"));


        boolean flag1 = values.stream().findFirst().get().equals("Alpha");


        boolean flag2 = values.stream().findAny().get().equals("Alpha");

        boolean flag3 = values.stream().anyMatch(str -> str.equals("Alpha"));

        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        System.out.println(values.stream().findFirst().get());
        System.out.println(values.stream().findAny().get());
        System.err.println(System.getProperty("values"));
    }

}
