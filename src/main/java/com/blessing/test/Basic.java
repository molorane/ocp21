package com.blessing.test;

import java.util.List;
import java.util.concurrent.Callable;

class Gen {
    public List<? extends Number> p() {
        return null;
    }
}

public class Basic<T> {


    Basic(T t) {

    }

    public static int p() {
        return 90;
    }

    public static void main(String[] stars) {
        Object o = null;
        @SuppressWarnings({"rawtypes", "unchecked", "unused"})
        Basic b = new Basic(o);


        Callable c = () -> p();
    }
}