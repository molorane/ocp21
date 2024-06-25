package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example30 {

    public static void main(String[] args) throws IOException {

        Path lexellsComet = Paths.get("./stars/../solar/");

        System.out.println(lexellsComet = lexellsComet.subpath(0, 2).resolve("m1.meteor").normalize());
    }
}
