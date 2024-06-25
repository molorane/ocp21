package com.blessing.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example5 {

    public static void main(String[] args) {
        try (FileInputStream fo = new FileInputStream("c");
             ObjectInputStream oo = new ObjectInputStream(fo)) {
            C c = (C) oo.readObject();
            System.out.println(c);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
