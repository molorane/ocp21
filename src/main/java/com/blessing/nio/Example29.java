package com.blessing.nio;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example29 {

    public static void main(String[] args) throws IOException {

        Path v1 = Paths.get("/./desert/./").resolve(Paths.get("sand.doc"));
        Path v2 = new File("/desert/./cactus/../sand.doc").toPath();
        System.out.println(v1);
        System.out.println(v2);
        System.out.print(Files.isSameFile(v1, v2));
        System.out.print(" " + v1.equals(v2));
        System.out.print(" " + v1.normalize().equals(v2.normalize()));

        Path lexellsComet = Paths.get("./stars/../solar/");

        System.out.println(lexellsComet = lexellsComet.subpath(0, 2).resolve("m1.meteor").normalize());
    }
}
