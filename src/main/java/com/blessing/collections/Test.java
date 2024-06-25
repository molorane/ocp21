package com.blessing.collections;

class LastError<T> {
    private T lastError;

    void setError(T t) {
        lastError = t;
        System.out.println("LastError: setError");
    }
}

class StrLastError<T extends CharSequence> extends LastError<String> {

    public StrLastError(T s) {
    }

    @Override
    void setError(String t) {
        // TODO Auto-generated method stub
        super.setError(t);
    }

    void setError(T s) {
        System.out.println("StrLastError: setError");
    }
}

public class Test {

    public static void main(String[] args) {
        StrLastError<String> err = new StrLastError<String>("Error");
        //err.setError("Last error");
    }

}
