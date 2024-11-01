package com.blessing;

public class MathAPI {

    public static void main(String[] args) {
        String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";

        String out = str.replace("<?xml version=\"1.0\" encoding=\"UTF-8\"?>", "");

        System.out.println(out);
    }

}
