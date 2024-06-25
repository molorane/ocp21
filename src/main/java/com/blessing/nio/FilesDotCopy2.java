package com.blessing.nio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesDotCopy2 {

    public static void main(String[] args) throws IOException {

        try (InputStream is = new FileInputStream("source-data.txt");
             OutputStream out = new FileOutputStream("output-data.txt")) {
            // Copy stream data to file
            Files.copy(is, Paths.get("c:\\mammals\\wolf.txt"));
            // Copy file data to stream
            Files.copy(Paths.get("c:\\fish\\clown.xsl"), out);
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
