package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("demo.txt");
        Path p2 = Paths.get("demo2.tx");

        Files.copy(p1, p2);

    }

}
