package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class FileCopy {

    public static void main(String[] args) {
        Path pathSource = Paths.get("src\\nio\\PathCompare1.java");
        Path pathDestination = Paths.get("C:\\Files\\PathCompare1");
        try {
            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Source file copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}