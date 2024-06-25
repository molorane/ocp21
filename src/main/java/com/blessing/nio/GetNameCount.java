package com.blessing.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetNameCount {

    public static void main(String[] args) {


        Path p1 = Paths.get("C:/a/b/c/d/d.txt");

        for (int i = 0; i < p1.getNameCount(); i++) {
            System.err.println(p1.getName(i));
        }

    }

}
