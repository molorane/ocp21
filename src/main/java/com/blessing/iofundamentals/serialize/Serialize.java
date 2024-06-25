/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.iofundamentals.serialize;

import java.io.*;

/**
 * @author moloranemothusimichael
 */
public class Serialize {

    private static class User implements java.io.Serializable {

        private static final long serialVersionUID = 1L;

        private transient int Id;
        private String name;
        private String password;
        private static double salary;

        public User(int Id, String name, String password) {
            this.Id = Id;
            this.name = name;
            this.password = password;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public int getId() {
            return this.Id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPassword() {
            return this.password;
        }

        public static double getSalary() {
            return salary;
        }

        public static void setSalary(double salary) {
            User.salary = salary;
        }

        @Override
        public String toString() {
            return "ID:" + this.Id + ", Name:" + this.name + ", Password:" + this.password + ", Salary:" + salary;
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //serialize();

        deserialize();
    }

    private static void serialize() {
        // TODO Auto-generated method stub
        User user = new User(2014098616, "Nomfundo Molorane", "Blessing*4");
        user.setSalary(12500);

        System.out.println(user);

        write(user);

        user.setId(201390242);
        user.setName("Love");

        write(user);

        System.out.println("Object erased: " + user);
    }

    private static void write(User user) {
        // Serialization
        try (FileOutputStream fileout = new FileOutputStream("user.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileout);) {
            out.writeObject(user);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private static void deserialize() {
        // TODO Auto-generated method stub

        User user = null;

        // Diserialization
        try (FileInputStream fileIn = new FileInputStream("user.ser");
             ObjectInputStream In = new ObjectInputStream(fileIn)) {
            user = (User) In.readObject();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found!");
            c.printStackTrace();
            return;
        }

        System.out.println("Object Diserialized: " + user);
    }

}
