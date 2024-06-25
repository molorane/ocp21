package com.blessing.exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ChainedException {
    public static void fooThrower() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public static void barThrower() throws SQLException {
        throw new SQLException();
    }

    public static void main(String[] args) {

        String str = "Java";
        String str2 = "Java";
        System.out.println(str == str2);
        try {
            fooThrower();
            barThrower();
        } catch (FileNotFoundException | SQLException multie) {
            System.out.println(multie);
        }
    }
}
