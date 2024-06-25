package com.blessing.security;

//import java.security.AccessController;
import java.security.PrivilegedAction;

public class SecurityDemo {

    private static final String KEY = "secret.option";

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try {
//            String str = AccessController.doPrivileged(new PrivilegedAction<String>() {
//                public String run() {
//                    return System.getProperty(KEY);
//                }
//            }, AccessController.getContext());

            //System.out.println(str);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
