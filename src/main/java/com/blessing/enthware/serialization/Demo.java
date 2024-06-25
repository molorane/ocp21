package com.blessing.enthware.serialization;

import java.io.*;

class Student implements Serializable {

    Student(int age) {
    }

    public static final long serialVersionUID = 1;
    public String name;
    public String grade;
    public String id = "S111";
    public int age = 15;


    //public String toString() { return "[" + name + ", " + grade + "]"; }

    public String toString() {
        return "[" + id + ", " + name + ", " + grade + ", " + age + "]";
    }
}

public class Demo {

    public static void main(String[] args) throws Exception {
        //serialize();
        deserialize();
    }

    public static void serialize() throws Exception {
        Student s = new Student(2);
        s.name = "bob";
        s.grade = "10";
        FileOutputStream fis = new FileOutputStream("bob.ser");
        ObjectOutputStream is = new ObjectOutputStream(fis);
        is.writeObject(s);
        is.close();
        deserialize();
    }

    public static void deserialize() throws Exception {

        FileInputStream fis = new FileInputStream("bob.ser");
        ObjectInputStream is = new ObjectInputStream(fis);
        Student s = (Student) is.readObject();
        is.close();

        System.out.println("Loaded " + s);
    }

}
