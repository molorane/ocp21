package com.blessing.stringsplit;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Demo4 {

    public static void s1() {
        String start = "Language#Programming!Java)Love_I";

        StringBuilder sb = new StringBuilder();

        for (char s : start.toCharArray()) {
            if ((s >= 65 && s <= 90) || (s >= 97 && s <= 122)) {
                sb.append(s);
            } else {
                sb.append(" ");
            }
        }
    }

    public static void s2() {
        String start = "the#man!in) % the_moon$";

        StringBuilder sb = new StringBuilder();

        for (char s : start.toCharArray()) {
            if ((s >= 65 && s <= 90) || (s >= 97 && s <= 122)) {
                sb.append(s);
            } else {
                sb.append(" ");
            }
        }

        StringTokenizer st = new StringTokenizer(sb.toString(), " ");

        while (st.hasMoreTokens()) {
            System.out.print(st.nextToken() + " ");
        }

        // string start = "the#man!in)the_moon";
        // string finish = "moon the in man the";
    }

    public static void s3() {
        String start = "the#man!in)the_moon";

        List<String> words = Arrays.asList(start);

        words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .filter(st -> {
                    int s = st.charAt(0);
                    return (s >= 65 && s <= 90) || (s >= 97 && s <= 122);
                })
                .forEach(f -> System.out.print(f));

        // string start = "the#man!in)the_moon";
        // string finish = "moon the in man the";
    }

    public static void main(String[] args) {
        s2();
    }
}
