package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDotFind {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("");
        Files.find(p, 2, (a, b) -> b.size() == 0).forEach(System.out::println);
        // a Path
        // b BasicFileAttributes
    }

}
