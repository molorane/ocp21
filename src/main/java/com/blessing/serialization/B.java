package com.blessing.serialization;

import java.io.Serializable;

public class B extends A implements Serializable {

    public B() {
        System.out.println("B");
    }
}
