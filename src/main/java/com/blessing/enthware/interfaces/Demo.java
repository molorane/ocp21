package com.blessing.enthware.interfaces;

import java.lang.annotation.Repeatable;

@interface Authors {
    Author[] value();
}

@Repeatable(Authors.class)
@interface Author {
    int id() default 0;

    String value();
}

public class Demo {

    static final String n = "Love";

    @Author(id = 9, value = n)
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        var var = 0;
    }

}
