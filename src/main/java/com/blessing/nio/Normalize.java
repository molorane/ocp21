package com.blessing.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Normalize {

    public static void main(String[] args) {

        Path p1 = Paths.get("a/b/c/./././d/../../c"); // none normalized path
        System.out.println(p1.normalize()); // abc


        Path p2 = Paths.get("a/../../../b"); // none normalized path
        System.out.println(p2.normalize()); // ../../b

        Path p3 = Paths.get("/a/../../../b"); // none normalized path
        System.out.println(p3.normalize()); // /b

        Path p4 = Paths.get("/../b"); // none normalized path
        System.out.println(p4.normalize()); // /b
    }

}
