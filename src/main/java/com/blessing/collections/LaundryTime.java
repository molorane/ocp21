package com.blessing.collections;

class Wash<T> {
    T item;

    public void clean(T item) {
        String s = "Clean " + item;
        System.out.println(s);
    }
}

public class LaundryTime {
    public static void main(String[] args) {
        Wash wash = new Wash<String>();
        wash.clean("socks");
    }
}