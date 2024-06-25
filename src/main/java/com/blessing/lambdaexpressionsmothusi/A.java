/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.lambdaexpressionsmothusi;

/**
 * @author madw
 */
public class A {

    private String name;

    public A(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return getName();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


}
