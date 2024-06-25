package com.blessing.nio.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        walk();
    }

    public static void list() throws IOException {
        try (Stream<Path> entries = Files.list(Paths.get("C:\\Files\\"))) {
            entries
                    .map(path -> path.toAbsolutePath())
                    .forEach(System.out::println);
        }
    }

    public static void walk() throws IOException {
        try (Stream<Path> entries = Files.walk(Paths.get("C:\\Files\\"))) {
            entries
                    .map(path -> path.toAbsolutePath())
                    .forEach(System.out::println);
        }
    }
}