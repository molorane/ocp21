/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.lambdaexpressionsmothusi;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

/**
 * @author madw
 */

interface MyNumber {
    double getValue();
}

public class LambdaExpressionsMothusi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        MyNumber myNumber = () -> 20.32;

        System.out.println(myNumber.getValue());

        Set<A> set = new TreeSet<>((A o1, A o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        set.add(new A("A"));
        set.add(new A("B"));
        set.add(new A("D"));
        set.add(new A("C"));
        System.out.println(set);

        Function<String, String> list;
    }

}
