package com.blessing.enthware.streams;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

public class DemoNestedLambda {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        DoubleFunction<DoubleUnaryOperator> doubleF = m -> n -> m * n;

        DoubleUnaryOperator db = i -> i;

        System.out.println(doubleF.apply(0).applyAsDouble(2));
    }

}
