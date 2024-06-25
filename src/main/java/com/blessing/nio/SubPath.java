package com.blessing.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SubPath {

    int i;

    public static void main(String[] args) {
        Path p1 = Paths.get("C:/a/b/c/d");

        System.err.println(p1.subpath(0, 3));
        System.err.println(p1.subpath(0, 5));
    }

}
