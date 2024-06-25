package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadAllLines {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("demo2.txt");

        List<String> lines = Files.readAllLines(p1);

        lines.forEach(System.out::println);

    }

}
