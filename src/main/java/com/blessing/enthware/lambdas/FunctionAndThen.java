package com.blessing.enthware.lambdas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionAndThen {

    static class Employee {
        String name;
        int age;

        public Employee(String name, int age) {
            super();
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return name;
        }
    }


    public static void main(String[] args) {

        List<Employee> list = Arrays.asList(
                new Employee("Nomfundo", 33),
                new Employee("Mothusi", 30),
                new Employee("Adam", 90),
                new Employee("Eve", 80)
        );

        Function<Employee, Integer> lo = e -> e.getAge();
        Function<Integer, Integer> dob = e -> LocalDate.now().getYear() - e;

        System.err.println(list.stream().map(Function.identity()).collect(Collectors.toList()));


    }
}
