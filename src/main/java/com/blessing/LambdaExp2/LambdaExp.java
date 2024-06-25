/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.LambdaExp2;

/**
 * @author madw
 */
public class LambdaExp {

    public static void main(String[] args) {

        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("10 is even");
        if (!isEven.test(9))
            System.out.println("9 is not even");

        NumericTest isNonNegative = (n) -> (n >= 0);

        if (isNonNegative.test(13))
            System.out.println("1 is not negative");
        if (!isNonNegative.test(-1))
            System.out.println("-1 is negative");
    }

}
