package com.blessing.enthware.stringorstringbuilder;

public class TestClass {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("12345678");
        //sb.setLength(5);
        sb.ensureCapacity(5);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);
        System.out.println(sb.length());
    }
}