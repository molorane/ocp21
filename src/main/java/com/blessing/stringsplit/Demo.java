package com.blessing.stringsplit;

import java.util.*;

public class Demo {

    public static void main(String[] args) {
        p3();
    }

    public static void p() {
        String start = "the#man!in) the_moon";

        String[] words = start.split("[^a-zA-Z0-9]+");

        for (int i = words.length - 1; i >= 0; i--)
            System.out.print(words[i] + " ");
        System.out.println();

        List<String> list = Arrays.asList(words);

        Collections.reverse(list);

        System.out.println("List: " + list);

        list.forEach(str -> System.out.print(str + " "));
        System.out.println();
        System.out.println(Arrays.toString(words));
    }

    public static void p1() {
        String start = "the#man!in)the_moon";

        List<String> list = Arrays.asList(start.split("[^a-zA-Z0-9]+"));
        Collections.reverse(list);

        list.forEach(x -> System.out.print(x + " "));
    }

    public static void p2() {
        String start = "the#man!in)the_moon";

        Queue<String> list = new LinkedList<>(Arrays.asList(start.split("[^a-zA-Z0-9]+")));

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static void p3() {
        String start = "the#man!in)the_moon";

        Deque<String> list = new LinkedList<>(Arrays.asList(start.split("[^a-zA-Z0-9]+")));

        Iterator<String> iter = list.descendingIterator();
        while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }

    public static void p4() {
        String start = "the#man!in)the_moon";

        List<String> list = new LinkedList<>(Arrays.asList(start.split("[^a-zA-Z0-9]+")));

        ListIterator<String> iter = list.listIterator(list.size());

        while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");
        }
    }

}
