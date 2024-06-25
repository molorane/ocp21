/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.FunctionalInter;

/**
 * @author madw
 */

@FunctionalInterface
public interface A {

    default void print() {
        System.out.println("print");
        print("in an interface");
    }

    void love();

    static void print(String str) {
        System.out.println(str);
    }
}
