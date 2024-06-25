package com.blessing.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Example2 {


    public static void main(String[] args) {

        try (FileInputStream fo = new FileInputStream("cat1");
             ObjectInputStream oo = new ObjectInputStream(fo)) {
            Cat cat = (Cat) oo.readObject();
            System.out.println(cat);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
