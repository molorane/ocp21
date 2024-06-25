/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.javapuzzles;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author madw
 */

public class JavaPuzzles {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        list = list.stream().map(x -> x * x).collect(Collectors.toList());

        Set<Integer> set = list.stream().sorted().collect(Collectors.toSet());

        set.forEach(System.out::println);

        //System.out.println(str.toString());
        //System.out.println(reverse);
    }

}
