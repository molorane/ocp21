package com.blessing.localization.l4;

import java.util.Locale;
import java.util.ResourceBundle;

public class Demo {

    public static void printMovieDetails(ResourceBundle resBundle) {
        String movieName = resBundle.getString("MovieName");
        Object revenue = resBundle.getObject("GrossRevenue");
        Object year = resBundle.getObject("Year");
        String author = resBundle.getString("author");
        System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue + " author " + author);
    }

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        ResourceBundle rb = ResourceBundle.getBundle("localization.l4.ResBundle", locale);
        printMovieDetails(rb);
    }

}
