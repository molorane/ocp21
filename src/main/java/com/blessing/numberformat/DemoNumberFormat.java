package com.blessing.numberformat;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class DemoNumberFormat {

    public static void main(String[] args) {
        double total = 3245.32;
        double tax = .07;
        double toatalWithTax = total + (total * tax);
        System.out.println(toatalWithTax);

        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setGroupingUsed(true); // commas every 3 digits
        nf.setMaximumFractionDigits(2);
        nf.setMinimumFractionDigits(2);

        String st = nf.format(toatalWithTax);
        System.out.println(st);

        DecimalFormat priceFormatter = new DecimalFormat("R0.00"); //setting the format, or ("R0.00"), ("R#.00"), ("R.00")
        String result = priceFormatter.format(toatalWithTax); //rounded operation
        System.out.println(result);

        Locale l = Locale.TAIWAN;

        NumberFormat df = DecimalFormat.getCurrencyInstance(l);

        System.out.println(df.format(toatalWithTax));

    }

}
