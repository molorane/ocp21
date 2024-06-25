package com.blessing.enthware.serialization;

import java.io.*;

class Boo {
    public Boo() {
        System.out.println("In Boo");
    }
}

class BooBoo extends Boo {
    public BooBoo() {
        System.out.println("In BooBoo");
    }

    static {
        System.out.println("moo set to 122434");
    }
}

class Moo extends BooBoo implements Serializable {
    int moo = 10;

    {
        System.out.println("moo set to 10");
    }

    public Moo() {
        System.out.println("In Moo");
    }
}

public class Demo1 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        deserialize();
    }

    public static void serialize() throws IOException {
        Moo moo = new Moo();
        moo.moo = 20;
        FileOutputStream fos = new FileOutputStream("moo1.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("moo1.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Moo moo = (Moo) is.readObject();
        is.close();
        System.out.println(moo.moo);
    }

}
