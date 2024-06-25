package com.blessing.localization.listresourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedBoxOfficeHits {

    public void printMovieDetails(ResourceBundle resBundle) {
        String movieName = resBundle.getString("MovieName");
        Long revenue = (Long) (resBundle.getObject("GrossRevenue"));
        Integer year = (Integer) resBundle.getObject("Year");
        System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue);
    }

    public static void main(String[] args) {
        LocalizedBoxOfficeHits localizedHits = new LocalizedBoxOfficeHits();
        // print the largest box-office hit movie for default (US) locale
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        localizedHits.printMovieDetails(ResourceBundle.getBundle("localization.listresourcebundle.ResBundle", locale));
        // print the largest box-office hit movie for Italian locale
        locale = new Locale("zu");
        //localizedHits.printMovieDetails(ResourceBundle.getBundle("localization.listresourcebundle.ResBundle", locale));
    }

}
