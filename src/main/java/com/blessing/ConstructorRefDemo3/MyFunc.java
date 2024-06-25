/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.ConstructorRefDemo3;

/**
 * @author madw
 */
// Implement a simple class factory using a constructor reference.
interface MyFunc<R, T> {

    R func(T n);
}
