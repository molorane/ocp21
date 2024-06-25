package com.blessing.enthware.nio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Paths;

public class ResolveSibling {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        writeData();
    }

    public static void writeData() throws Exception {
        var p1 = Paths.get("test22.txt");
        var p2 = p1.resolveSibling("text33.txt");
        System.out.println(p1.relativize(p2));
        var bw = new BufferedWriter(new FileWriter(p2.toFile()));
        bw.write("hello");
        bw.close();
    }
}
