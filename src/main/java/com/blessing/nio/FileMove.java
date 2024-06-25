package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileMove {
    public static void main(String[] args) {

        Path pathSource = Paths.get("C:\\Files\\subdir");
        Path pathDestination = Paths.get("C:\\Files\\move\\subdir");
        try {
            Files.move(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file moved successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}