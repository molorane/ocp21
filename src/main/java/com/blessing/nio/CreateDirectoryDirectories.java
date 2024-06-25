package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectoryDirectories {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("a/b");

        Files.createDirectories(p1);
        Files.createDirectory(p1);

    }

}
