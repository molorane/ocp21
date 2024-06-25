/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.BlockLambdaDemo;

/**
 * @author madw
 */
public class BlockLambdaDemo {

    public static void main(String[] args) {

        int age = 1;

        NumericFunc factorial = (n) -> {
            int result = age;

            for (int i = 1; i <= n; i++)
                result *= i;
            return result;
        };

        System.out.println("Factorial of 5 is " +
                factorial.funct(5));
        System.out.println("Factorial of 3 is " +
                factorial.funct(3));
    }

}
