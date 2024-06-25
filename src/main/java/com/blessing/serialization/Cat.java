package com.blessing.serialization;

import java.io.Serializable;

public class Cat implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String name;
    private int i;

    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cat {" + name + "}";
    }
}
