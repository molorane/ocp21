package com.blessing.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.List;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAn {
    abstract String str();

    int value();
}

@MyAn(value = 900, str = "")
public class Demo1 {

    @MyAn(str = "Example", value = 90)
    public static void myA() {

    }

    @SafeVarargs
    public Demo1(List<String>... l) {

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        try {
            Class<? extends Demo1> c = new Demo1().getClass();

            Method m = c.getMethod("myA");

            MyAn cx = c.getAnnotation(MyAn.class);

            MyAn ann = m.getAnnotation(MyAn.class);

            System.out.println(cx.str() + " " + cx.value());
        } catch (Exception ex) {

        }
    }

}
