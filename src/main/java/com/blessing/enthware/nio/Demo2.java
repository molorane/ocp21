package com.blessing.enthware.nio;

import java.nio.file.Paths;

public class Demo2 {

    public static void main(String[] args) {
        System.out.println(Paths.get("//", "test.txt"));
        //System.out.println(Paths.get("\\test.txt"));
    }

}
