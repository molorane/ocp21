package com.blessing.lambdafunctions.unaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Demo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8);

        UnaryOperator<Integer> un = i -> i * i;

        BinaryOperator<Integer> bn = (i, j) -> i * j;

        System.out.println(un.apply(2));
        System.out.println(bn.apply(2, 2));
    }
}
