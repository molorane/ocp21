package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Course {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class CollectorsJoining {

    public static void main(String[] args) {
        List<Course> cList = Arrays.asList(
                new Course("803", "OCAJP 7"),
                new Course("808", "OCAJP 8"),
                new Course("809", "OCPJP 8"));

        String s = cList.stream()
                .filter(c -> c.getName().indexOf("8") > -1)
                .map(c -> c.getId())
                .collect(Collectors.joining("1Z0 "));
        System.out.println(s);
    }

}
