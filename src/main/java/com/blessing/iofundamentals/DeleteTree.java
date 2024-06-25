package com.blessing.iofundamentals;

import java.io.File;
import java.util.stream.Stream;

public class DeleteTree {

    public static void deleteTree(File f) {
        if (!f.isDirectory())
            f.delete();
        else {
            Stream.of(f.listFiles()).forEach(s -> deleteTree(s));
            f.delete();
        }
    }

    public static void main(String[] args) {
        deleteTree(new File("ss/"));
    }

}
