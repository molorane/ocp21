package com.blessing.iofundamentals;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Won't save data, works like BufferedWriter
         * This leads to resource leak, out never closed
         */
        try {
            PrintWriter out = new PrintWriter("test3.txt");
            out.append("Hello World!");
        } catch (IOException e) {

        }
    }

}
