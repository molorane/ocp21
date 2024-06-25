package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class FilesDotLines {

    public static void main(String[] args) throws IOException {

        Path p = Paths.get("demo2.tx");
        Stream<String> lines = Files.lines(p);

        Stream<String> o = lines.flatMap(line -> Arrays.stream(line.split("")));

        o.forEach(System.out::println);
        lines.close();
    }

}
