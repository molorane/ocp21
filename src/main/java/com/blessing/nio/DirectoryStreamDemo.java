package com.blessing.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashSet;

public class DirectoryStreamDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashSet<String> s = new HashSet<>();

        Path p = Paths.get(System.getProperty("user.dir"));

        System.out.println(System.getProperty("user.dir"));

        try (DirectoryStream<Path> paths = Files.newDirectoryStream(p)) {

            for (Path path : paths) {
                BasicFileAttributes bfa = Files.readAttributes(path, BasicFileAttributes.class);
                System.out.println(path.toAbsolutePath() + ", is directoty " + bfa.isDirectory());
            }
        } catch (IOException e) {
            System.err.println(e);
        }

    }

}
