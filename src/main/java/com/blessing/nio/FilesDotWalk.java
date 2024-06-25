package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDotWalk {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("src");
        Files.walk(p, 1).forEach(System.out::println);
    }

}
