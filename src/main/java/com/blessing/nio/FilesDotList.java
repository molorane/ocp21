package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesDotList {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("");
        Stream<Path> lines = Files.list(p);
        lines.forEach(System.out::println);
        System.out.println();
        System.out.println();
        Files.list(p).filter(pp -> pp.endsWith(".tx"))
                .forEach(System.out::println);
    }

}
