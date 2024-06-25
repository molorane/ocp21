package com.blessing.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MultiValue {
    int getValue() default 2;

    String getMessage();

    double getDouble();
}

public class Demo2 {

    @MultiValue(getDouble = 900, getMessage = "Hello")
    static String x;

    @MultiValue(getDouble = 9, getMessage = "Hello")
    public static void display() {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {

            Class<?> c = new Demo2().getClass();

            Method m = c.getMethod("display");
            Field f = c.getField("x");

            MultiValue a = f.getAnnotation(MultiValue.class);

            System.out.println(a.getDouble());

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
