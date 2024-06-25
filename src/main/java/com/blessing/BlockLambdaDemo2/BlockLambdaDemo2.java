/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.BlockLambdaDemo2;

/**
 * @author madw
 */
public class BlockLambdaDemo2 {

    public static void main(String[] args) {
        StringFunc reverse = (String str) -> {
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
    }
}
