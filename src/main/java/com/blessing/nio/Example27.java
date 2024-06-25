package com.blessing.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example27 {

    public static void main(String[] args) throws IOException {

        Files.walk(Paths.get("nom")).forEach(System.out::println);

        System.out.println(Files.walk(Paths.get("nom")).count());
        System.out.println(Paths.get("/bag/of/tricks/.././disappear.txt").subpath(2, 4));
        Path p = new File("").toPath();

        Path p1 = Paths.get("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }
}
