package com.blessing.nio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferedReader {

    public static void main(String[] args) throws IOException {

        try (FileInputStream fis = new FileInputStream("demo2.tx");
             BufferedReader br = new BufferedReader(new InputStreamReader(fis));) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        p();
    }

    // same code
    public static void p() throws IOException {
        Path p = Paths.get("demo2.tx");

        try (BufferedReader br = Files.newBufferedReader(p)) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }

    }

}
