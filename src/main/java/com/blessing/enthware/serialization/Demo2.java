package com.blessing.enthware.serialization;

import java.io.*;

class Booby {
    int i;

    public Booby() {
        i = 10;
        System.out.print("Booby");
    }
}

class Dooby extends Booby implements Serializable {
    int j;

    public Dooby() {
        j = 20;
        System.out.print("Dooby");
    }
}

class Tooby extends Dooby {
    int k;
    Demo2 demo2;

    public Tooby() {
        k = 30;
        System.out.print("Tooby");
    }
}

public class Demo2 {

    int i;

    public Demo2() {
        i = 12130;
    }

    public Demo2(Demo2 d) {
        Demo2 d1 = new Demo2();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        var t = new Tooby();
        t.i = 100;
        var oos = new ObjectOutputStream(new FileOutputStream("test.ser"));
        oos.writeObject(t);
        oos.close();

        var ois = new ObjectInputStream(new FileInputStream("test.ser"));
        t = (Tooby) ois.readObject();
        ois.close();

        //System.err.println(t.demo2.i);
        System.out.println(t.i + " " + t.j + " " + t.k);

    }

}
