package com.blessing.iofundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (var reader = new InputStreamReader(System.in);
             var bufferedReader = new BufferedReader(reader);) {
            String line = bufferedReader.readLine();
            System.out.println("Line " + line);
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
