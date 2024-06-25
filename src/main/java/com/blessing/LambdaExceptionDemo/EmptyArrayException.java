/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.LambdaExceptionDemo;

/**
 * @author madw
 */
public class EmptyArrayException extends Exception {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    EmptyArrayException() {
        super("Array Empty");
    }
}
