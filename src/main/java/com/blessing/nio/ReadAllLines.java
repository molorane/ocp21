package com.blessing.nio;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Stream;

public class ReadAllLines {


    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("demo2.txt");

        List<String> lines = Files.readAllLines(p1);

        lines.forEach(System.out::println);

    }

}
