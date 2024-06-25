package com.blessing.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativeAbsolutePath {

    public static void main(String[] args) {

        Path p1 = Paths.get("a/b/c/d"); // relative path
        Path p2 = Paths.get("/c", "d"); // absolute path
        Path p3 = Paths.get("C:a/b/c"); // absolute path

        System.out.println(p1.getFileName());
        System.out.println(p1.getRoot());
        System.out.println(p1.getParent());

        System.out.println(p2.getFileName());
        System.out.println(p2.getRoot());
        System.out.println(p2.getParent());

        System.out.println(p3.getFileName());
        System.out.println(p3.getRoot());
        System.out.println(p3.getParent());
        p1.toAbsolutePath();
    }

}
