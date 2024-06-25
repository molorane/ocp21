package com.blessing.iofundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws IOException {
        System.out.print("Type a character: ");
        int val = 0;
        try {
            // the return type of read is int, but it returns a byte value!
            val = System.in.read();
        } catch (IOException ioe) {
            System.err.println("Cannot read input " + ioe);
            System.exit(-1);
        }
        System.out.println("You typed: " + val);
        p();
    }

    public static void p() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
        // or use java.util.Scanner, as in:
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        System.out.println(str);
    }
}