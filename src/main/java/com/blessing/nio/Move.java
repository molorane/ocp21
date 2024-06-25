package com.blessing.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Move {

    public static void main(String[] args) throws IOException {
		
		/*Path p1 = Paths.get("demo4.txt");
		Path p2 = Paths.get("demo3.tx");

		Files.move(p1,p2);*/

        Path p3 = Paths.get("x");
        Path p4 = Paths.get("nom");

        Files.move(p3, p4);

    }

}
