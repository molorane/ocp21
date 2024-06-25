package com.blessing.enthware.stringorstringbuilder;

class P {

}

public class Demo2 {

    public static void main(String[] args) {

        String str = new StringBuilder("xxx-xxx-") + "lo";

        System.err.println(str.contains("ooo"));

        long l = 9;
        int i = 2;
        Object o = l / i;
        System.err.println(o);
    }

}
