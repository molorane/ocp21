package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompareTo {

    public static void main(String[] args) throws IOException {

        Path p2 = Paths.get("demo2.tx");
        Path p3 = Paths.get("demo3.tx");


        System.out.println(p2.compareTo(p3));

        System.out.println(Files.isDirectory(p2));
    }
}
