package com.blessing.nio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Mark {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("names.txt"));
        System.out.println(br.readLine());
        br.mark(0); // MARK
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        br.reset(); // RESET
        System.out.println(br.readLine());
    }

}
