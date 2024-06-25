/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.ConstructorRefDemo;

/**
 * @author madw
 */
public class MyClass {

    private int val;
    // This constructor takes an argument.

    MyClass(int v) {
        val = v;
    }
    // This is the default constructor.

    MyClass() {
        val = 0;
    }
    // ...

    int getVal() {
        return val;
    }

    ;
}
