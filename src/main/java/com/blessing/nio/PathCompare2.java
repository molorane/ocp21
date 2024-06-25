package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


// illustrates how to use Files class to compare two paths
public class PathCompare2 {
    public static void main(String[] args) throws IOException {
        Path path1 = Paths.get("src\\nio");
        Path path2 = Paths.get("C:\\workspace\\eclipse\\OCP11\\src\\nio");
        System.out.println(path1.toAbsolutePath());
        System.out.println("Files.isSameFile(path1, path2) is: " + Files.isSameFile(path1, path2));
    }
}