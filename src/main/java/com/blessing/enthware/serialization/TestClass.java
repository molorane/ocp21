package com.blessing.enthware.serialization;

import java.io.*;

class Bond {
    String ticker;
    double coupon;
    java.time.LocalDate maturity;
}

class Portfolio implements Serializable {
    String accountName;
    Bond[] bonds;
}

public class TestClass {

    public static void main(String[] args) throws Exception {
        deserialize();
    }

    public static void serialize() throws IOException {
        Portfolio moo = new Portfolio();
        FileOutputStream fos = new FileOutputStream("moo.ser");
        ObjectOutputStream os = new ObjectOutputStream(fos);
        os.writeObject(moo);
        os.close();
    }

    public static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("moo.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Portfolio moo = (Portfolio) is.readObject();
        is.close();
        System.out.println(moo);
    }
}