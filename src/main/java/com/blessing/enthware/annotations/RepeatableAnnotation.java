package com.blessing.enthware.annotations;

import java.lang.annotation.Repeatable;

@interface Authors {
    Author[] value();

    String team() default "enthuware";
}

@Repeatable(Authors.class)
@interface Author {
    int id() default 0;

    String[] value();
}

public class RepeatableAnnotation {

    @Authors(value = {@Author("bob"), @Author("love")}, team = "java")
    String value;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

    @Authors(value = @Author("bob"), team = "java")
    @Author("alice")
    void someMethod(int index) {

    }

}
