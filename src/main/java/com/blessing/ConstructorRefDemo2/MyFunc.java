/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.ConstructorRefDemo2;

/**
 * @author madw
 */
// MyFunc is now a generic functional interface.
interface MyFunc<T> {

    MyClass<T> func(T n);
}
