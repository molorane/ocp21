package com.blessing.enthware.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    static Path p1 = Paths.get("\\finance\\data\\reports\\daily\\pnl.txt");

    public static void main(String[] args) {
        System.out.println(p1.subpath(0, 2));
    }
}