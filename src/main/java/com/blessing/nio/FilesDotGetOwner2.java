package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDotGetOwner2 {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("gorilla.txt");
        System.err.println(Files.getOwner(path).getName());
    }
}
