package com.blessing.enthware.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Demo2 {

    public static boolean isValid(Path p) {
        return p.startsWith("temp") && p.endsWith("clients.dat");
    }

    public static void main(String[] args) {
        var p1 = Paths.get("\\temp\\records");
        var p2 = p1.resolve("clients.dat");
        System.out.println(p2 + " " + isValid(p2));
    }

}
