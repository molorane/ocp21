package com.blessing.iofundamentals;

import java.io.*;

public class Questions {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);
        p();
    }

    public static void p() throws IOException {
        FileInputStream findings = new FileInputStream("log.txt");
        DataInputStream dataStream = new DataInputStream(findings);
        BufferedReader br = new BufferedReader(new InputStreamReader(dataStream));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}
