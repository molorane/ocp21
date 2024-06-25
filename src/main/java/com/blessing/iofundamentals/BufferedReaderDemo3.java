package com.blessing.iofundamentals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (var br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("test1.txt")))) {
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

}
