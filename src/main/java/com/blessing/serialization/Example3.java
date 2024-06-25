package com.blessing.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example3 {

    public static void main(String[] args) {
        C c = new C(); // Print A,B,C

        try (FileOutputStream fo = new FileOutputStream("c");
             ObjectOutputStream oo = new ObjectOutputStream(fo)) {

            oo.writeObject(c);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
