package com.blessing.enthware.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class GroupingByDemo3 {

    static class Course {
        private String id;
        private String category;

        public Course(String id, String category) {
            this.id = id;
            this.category = category;
        }

        public String toString() {
            return id + " " + category;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

    }

    public static void main(String... ar) {
        List<Course> s1 = Arrays.asList(
                new Course("OCAJP", "Java"),
                new Course("OCPJP", "Java"),
                new Course("C#", "C#"),
                new Course("OCEJPA", "Java"));

        s1.stream()
                .collect(Collectors.groupingBy(c -> c.getCategory()))
                .forEach((m, n) -> System.out.println(n));
    }

}
