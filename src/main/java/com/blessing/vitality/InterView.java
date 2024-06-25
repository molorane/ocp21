package com.blessing.vitality;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class InterView {


//    Write a program that prints the numbers from 1 to 100. But for multiples of three print "Fizz" instead of the number
//        and for the multiples of five print "Buzz". For numbers which are multiples of both three and five print "FizzBuzz".


    public static void main(String[] args) {

        int f = greenTicket(1, 2, 3);
        int s = greenTicket(2, 2, 2);
        int t = greenTicket(1, 1, 2);
        int u = greenTicket(2, 3, 2);

        System.out.printf("%s %s %s %s", f, s, t, u);
    }

    public static Integer greenTicket(Integer a, Integer b, Integer c) {
        if (a != b && a != c) {
            return 0;
        }

        if (a == b && b == c) {
            return 20;
        }

        return 10;
    }

    public static String theEnd(String str, boolean front) {
        return (front) ? str.charAt(0) + "" : str.charAt(str.length()-1) + "";
    }

    public static int loneSum(int a, int b, int c) {

        if(a == b && a == c) {
            return 0;
        }

        if(a != b && a != c && c != b) return a + b + c;

        if(a == b) return c;
        if(a == c) return b;
        return a;
    }

    public static boolean lastDigit(int a, int b, int c) {

        int aRightMost = a % 10;
        int bRightMost = b % 10;
        int cRightMost = c % 10;

        return (aRightMost == bRightMost || aRightMost == cRightMost || bRightMost == cRightMost);
    }

    public static boolean lastsaDigit(int a, int b, int c) {

        final String aString = String.valueOf(a);
        final String bString = String.valueOf(b);
        final String cString = String.valueOf(c);

        int[] aArrray = new int[aString.length()];
        int[] bArrray = new int[bString.length()];
        int[] cArrray = new int[cString.length()];

        for (int i = 0; i < aArrray.length; i++) {
            aArrray[i] = aArrray[i];
        }

        // Confirm if int a has right most
        int aLargest = aArrray[aArrray.length - 1];

        for (int j : aArrray) {
            if (aLargest <= j) {
                return false;
            }
        }

        // Confirm if int b has right most
        for (int i = 0; i < bArrray.length; i++) {
            bArrray[i] = bArrray[i];
        }

        int bLargest = bArrray[aArrray.length - 1];

        for (int j : bArrray) {
            if (bLargest <= j) {
                return false;
            }
        }

        // Confirm if int c has right most
        for (int i = 0; i < cArrray.length; i++) {
            cArrray[i] = cArrray[i];
        }

        int cLargest = aArrray[aArrray.length - 1];

        for (int j : cArrray) {
            if (cLargest <= j) {
                return false;
            }
        }

        return true;
    }
}
