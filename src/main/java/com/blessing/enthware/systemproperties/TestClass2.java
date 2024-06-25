package com.blessing.enthware.systemproperties;

public class TestClass2 {


    static char f;

    public static void main(String args[]) {

        for (var x : System.getProperties().entrySet()) {
            var m = x.getKey();
            System.err.println(System.getProperty(m.toString()));
        }

        for (var x : System.getProperties().keySet()) {
            System.out.println(x);
        }
    }
}