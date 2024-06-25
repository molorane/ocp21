/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.javapuzzles;

/**
 * @author madw
 */
public class Test {

    public static void main(String[] args) {
        int b = 0b010101; // Binary base 2
        int i = 020 + 2;  // Octal base 8
        int d = 1991; // Decimal base 10
        int h = 0x819381; // Hexadecimal base 16

        int java7 = 1_000_000; // Introduced in Java 7 for readability

        System.out.println(b);
        System.out.println(i);
        System.out.println(d);
        System.out.println(h);
        System.out.println(java7);
    }
}
