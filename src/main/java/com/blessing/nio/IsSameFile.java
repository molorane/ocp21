package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IsSameFile {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("a");
        Path p2 = Paths.get("demo2.tx");

        boolean same = Files.isSameFile(p1, p2);
        System.out.println(same);

    }

}
