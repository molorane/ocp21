package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ":" + marks;
    }

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
}

public class GroupingByDemo2 {

    String t = new String();


    public static void main(String... ar) {
        List<Student> ls = Arrays.asList(new Student("S1", 20), new Student("S3", 30), new Student("S3", 20));


        Map<Integer, List<String>> grouping =
                ls.stream().collect(
                        Collectors.groupingBy(
                                Student::getMarks,
                                Collectors.mapping(Student::getName, Collectors.toList())));

        System.out.println(grouping);


        Map<Integer, List<Student>> grouping1 = ls.stream().
                collect(Collectors.groupingBy(s -> s.getMarks()));

        System.out.println(grouping1);
    }

}
