/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.javapuzzles;

/**
 * @author madw
 */
public class Byting {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        for (byte b = 0; b <= 127; b++) {
            System.out.println(b);
        }
    }
}
