package com.blessing.enthware.stringorstringbuilder;

public class Demo1 {

    public static String hidePhone(String fullPhoneNumber) {
        //1 Insert code here
        //return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
        //return new StringBuilder(fullPhoneNumber).append("xxxx", 0, 3).toString();
        //return new StringBuilder("xxxx").insert(0, fullPhoneNumber, 0, 8).toString();
        return new StringBuilder(fullPhoneNumber).substring(0, 8) + "xxxx";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "ddd-ddd-dddd";
        System.out.println(hidePhone(s));

        StringBuilder sb = new StringBuilder("xxxx");
        sb.replace(0, 3, "love");

        System.out.println(sb);
    }

}
