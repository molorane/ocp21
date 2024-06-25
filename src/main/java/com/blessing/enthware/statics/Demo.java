package com.blessing.enthware.statics;

public class Demo {

    static int i = m("1");

    static {
        m("2");
    }

    static int j = m("44");

    int k = m("5");

    {
        m("0");
    }

    long l = m("8");

    public static void main(String[] args) {
        new Demo();
    }

    public static int m(String s) {
        System.out.println(s);
        return Integer.parseInt(s);
    }

}
