package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class FileDelete {
    public static void main(String[] args) {

        Path pathSource = Paths.get("C:\\Files\\move\\subdir\\Jehoshaphat.pptx");
        try {
            Files.delete(pathSource);
            System.out.println("File deleted successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}