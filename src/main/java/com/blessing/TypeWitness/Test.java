/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.TypeWitness;

import java.util.List;
import java.util.Set;

/**
 * @author madw
 */
class Easy {
    public static <T> T foo() {
        return null;
    }
}

public class Test {

    public static void main(String[] args) {
        foo(Easy.<List<String>>foo());

        foo(Easy.<Set<String>>foo());
    }

    private static void foo(List<String> list) {
        System.out.println("list");
    }

    private static void foo(Set<String> set) {
        System.out.println("set");
    }
}
