package com.blessing.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Notes {
    public void printNotes() {
        try (OutputStream out = System.out) { // y1
            Files.copy(Paths.get("log.txt"), out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] coursework) {
        new Notes().printNotes();
    }
}