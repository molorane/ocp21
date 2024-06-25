/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.LambdaDemo3;

/**
 * @author madw
 */
public class LambdaDemo3 {

    public static void main(String[] args) {
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;

        if (isFactor.test(10, 2))
            System.out.println("2 is a factor of 10.");
        if (!isFactor.test(10, 3))
            System.out.println("3 is not a factor of 10.");
    }
}
