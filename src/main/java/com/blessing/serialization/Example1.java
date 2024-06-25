package com.blessing.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Example1 {


    public static void main(String[] args) {

        try (FileOutputStream fo = new FileOutputStream("cat1");
             ObjectOutputStream oo = new ObjectOutputStream(fo)) {

            var cat = new Cat("Luno");
            oo.writeObject(cat);

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
