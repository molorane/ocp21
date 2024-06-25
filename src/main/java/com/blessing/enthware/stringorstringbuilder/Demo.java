package com.blessing.enthware.stringorstringbuilder;

public class Demo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = "\td  d";
        String str1 = "\t \n";
        System.err.println(str.isBlank());
        System.err.println(str.stripLeading());
        String str3 = str1.strip();
        System.out.println(str3 == "");
        ;
        System.out.println(str3.isBlank());
    }

}
