package com.blessing.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Resolve2 {

    public static void main(String[] args) {
        Path p1 = Paths.get("a/b/../../c");
        Path p2 = Paths.get("/d/e/f");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }

}
