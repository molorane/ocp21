package com.blessing.iofundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo2 {

    /**
     * FileOutputStream
     * FileInputStream
     * <p>
     * BufferedReader --> Reader
     * BufferedWriter --> Writer
     * <p>
     * PrintStream --> System.out , System.err
     * PrintWriter
     */


    public static void main(String[] args) {

        /**
         * Data won't be saved into the file test1.txt because flush() method which forces
         * buffer data to be written to destination was not called.
         */

        Writer w;
        BufferedWriter out;
        try {
            w = new FileWriter("test2.txt");
            out = new BufferedWriter(w);
            out.write("Hello World!");

        } catch (IOException e) {

        }
    }

}
