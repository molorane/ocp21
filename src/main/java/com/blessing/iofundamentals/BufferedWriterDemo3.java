package com.blessing.iofundamentals;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo3 {

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

    class C {


        public void m() {
            int i = (i = 9) * 4;
        }
    }


    public static void main(String[] args) {

        try (var out = new BufferedWriter(
                new FileWriter("test1.txt"))) {
            out.write("Hello World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
