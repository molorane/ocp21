package com.blessing.iofundamentals;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (PrintWriter out = new PrintWriter("test3.txt")) {
            out.append("Hello World! OCP");
        } catch (IOException e) {

        }
    }

}
