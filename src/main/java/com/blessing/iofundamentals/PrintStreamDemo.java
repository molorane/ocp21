package com.blessing.iofundamentals;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        try (PrintStream out = new PrintStream("test2.txt");) {
            out.append("Hello World!");
        } catch (IOException e) {

        }
    }

}
