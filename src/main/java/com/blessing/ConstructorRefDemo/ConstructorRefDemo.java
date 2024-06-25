/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.ConstructorRefDemo;

/**
 * @author madw
 */
public class ConstructorRefDemo {

    public static void main(String[] args) {

        // Create a reference to the MyClass constructor.
        // Because func() in MyFunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyFunc myClassCons = MyClass::new;

        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func(100);
        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal());


        MyFunc2 classCons = MyClass::new;
        MyClass c = classCons.func();
        System.out.println("val in c is " + c.getVal());
    }
}
