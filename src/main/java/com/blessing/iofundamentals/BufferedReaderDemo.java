package com.blessing.iofundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(reader);

        try {
            String line = bufferedReader.readLine();
            System.out.println("Line " + line);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {

            try {
                reader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
