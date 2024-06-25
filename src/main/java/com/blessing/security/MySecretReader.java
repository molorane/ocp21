package com.blessing.security;

//import java.security.AccessController;
import java.security.PrivilegedAction;

public class MySecretReader {

    private static final String KEY = "secret.option";

//    public static String getSecret() {
//        return AccessController.doPrivileged(new PrivilegedAction<String>() {
//            public String run() {
//                return System.getProperty(KEY);
//
//            }
//        });
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //System.out.println(getSecret());
    }

}
