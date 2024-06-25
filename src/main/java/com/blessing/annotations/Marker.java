package com.blessing.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {

}

public class Marker {

    @SuppressWarnings("unchecked")
    public void p(List<String>... l) {

    }

    @MyMarker
    public static void myMeth() throws NoSuchMethodException {
        Marker mk = new Marker();

        Method md = mk.getClass().getMethod("myMeth");

        if (md.isAnnotationPresent(MyMarker.class)) {
            System.out.println("MyMaker is present");
        }
    }

    public static void main(String[] args) throws NoSuchMethodException {
        // TODO Auto-generated method stub
        myMeth();
    }

}
