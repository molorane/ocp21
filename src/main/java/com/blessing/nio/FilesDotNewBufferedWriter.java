package com.blessing.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDotNewBufferedWriter {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("gorilla.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_16)) {
            writer.write("");
        } catch (IOException e) {
            // Handle file I/O exception...
        }
    }
}
