package com.blessing.iofundamentals;

public class StringDotFormatter {

    public static void main(String[] args) {
        String name = "sonoo";
        String sf1 = String.format("Name is %9s", name);
        String sf2 = String.format("value is %8.2f", 32.33434);
        String sf3 = String.format("Value is %12.6f", 32.33634);//returns 12 char fractional part filling with 0
        String sf4 = String.format("%d %1$x %1$o", 16);
        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
    }

}
