package com.blessing.exceptions;

import java.util.Scanner;

public class ScanInt5 {

    public static void main(String[] args) {
        String integerStr = "";
        System.out.println("The string to scan integer from it is: " + integerStr);
        Scanner consoleScanner = new Scanner(integerStr);
        try {
            System.out.println("The integer value scanned from string is: " + consoleScanner.nextInt());
        } catch (NullPointerException | IndexOutOfBoundsException multie) {
            System.out.println("Error: An error occured while attempting to scan the integer");
        }
    }
}