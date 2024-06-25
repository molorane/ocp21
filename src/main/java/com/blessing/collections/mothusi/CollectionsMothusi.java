/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blessing.collections.mothusi;

import java.util.*;

/**
 * @author madw
 */
public class CollectionsMothusi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SortedSet<Integer> list = new TreeSet<>();
        list.add(23);
        list.add(10);
        list.add(24);
        System.out.println(list);

        for (Integer i : list) {
            i = 90;
        }
        System.out.println(list);

        List<Integer> listA = new ArrayList<>();
        listA.add(23);
        listA.add(10);
        listA.add(24);
        ListIterator<Integer> li = listA.listIterator();
        while (li.hasNext()) {
            if (li.next().equals(23)) {
                li.set(456);
                System.out.println("equal");
            }
        }
        System.out.println(list);

        Iterator<Integer> l = listA.iterator();
        while (l.hasNext()) {
            if (l.next().equals(23)) {
                System.out.println("equal");
            }
        }
    }

}
