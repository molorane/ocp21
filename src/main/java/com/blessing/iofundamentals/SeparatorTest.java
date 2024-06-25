package com.blessing.iofundamentals;

import java.io.File;

public class SeparatorTest {

    public static void main(String[] args) {
        System.out.println(java.io.File.separator);
        System.out.println(File.separatorChar);
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("path.separator"));
    }

}
