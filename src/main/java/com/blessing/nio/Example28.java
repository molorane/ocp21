package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Paths;

public class Example28 {

    public static void main(String[] args) throws IOException {

        System.err.println(Paths.get("../sang").getParent().getParent());
        System.err.println(Paths.get("/sing").getParent().getRoot());
        System.err.println(Paths.get("/song").getRoot().getRoot());
        System.err.println(Paths.get("../sung").getRoot().getParent());
    }
}
