package com.blessing.advanceclassdesign.staticnestedclasses;

import java.util.List;
import java.util.function.Consumer;

class Student {
    private String name;
    private int marks;


    public Student(String name, int marks) {
        super();
        this.name = name;
        this.marks = marks;
    }

    //constructor and getters and setters not shown

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void addMarks(int m) {
        this.marks += m;
    }

    public void debug() {
        System.out.println(name + ":" + marks);
    }
}


public class Demo {

    public static void show(Student s) {
        System.out.println(s.getMarks());
    }

    public static void main(String[] args) {
        List<Student> slist = List.of(new Student("S1", 40), new Student("S2", 35), new Student("S3", 30));
        Consumer<Student> increaseMarks = s -> s.addMarks(10);
        slist.forEach(increaseMarks);
        slist.forEach(Student::debug);
    }


}
