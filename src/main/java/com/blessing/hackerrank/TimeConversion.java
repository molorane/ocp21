package com.blessing.hackerrank;

public class TimeConversion {

    static String timeConversion(String s) {
        String h = s.substring(0, 2);
        String m = s.substring(3, 5);
        String sec = s.substring(6, 8);
        String clock = s.substring(8);

        if (clock.equalsIgnoreCase("pm")) {
            if (Integer.parseInt(h) == 12) {
                h = "12";
            } else {
                h = 12 + Integer.parseInt(h) + "";
            }
        } else {
            if (Integer.parseInt(h) == 12) {
                h = "00";
            }
        }
        return h + ":" + m + ":" + sec;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s = "12:40:22AM";
        String mil = timeConversion(s);
        System.out.println(mil);
    }

}
