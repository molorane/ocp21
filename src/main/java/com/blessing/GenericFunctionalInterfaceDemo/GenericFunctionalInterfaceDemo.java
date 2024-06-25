/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.GenericFunctionalInterfaceDemo;

/**
 * @author madw
 */
public class GenericFunctionalInterfaceDemo {

    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return result;
        };

        System.out.println("Lambda reversed is "
                + reverse.func("Lambda"));
        System.out.println("Expression reversed is "
                + reverse.func("Expression"));

        System.out.println("");

        // Now, use an Integer-based version of SomeFunc.
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };

        System.out.println("The factoral of 3 is " + factorial.func(3));
        System.out.println("The factoral of 5 is " + factorial.func(5));
    }

}
