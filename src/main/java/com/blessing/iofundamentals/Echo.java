package com.blessing.iofundamentals;

import java.io.Console;

public class Echo {

    public static void main(String[] args) {
        // get the System console object
        Console console = System.console();
        if (console == null) {
            System.err.println("Cannot retrieve console object - are you running you"
                    + " application from an IDE? \nExiting the application ... ");
            System.exit(-1); // terminate the application
        }

        // read a line and print it through printf
        console.printf(console.readLine());
    }

}
