package com.blessing.lambdafunctions.functional;

@FunctionalInterface
interface Cust<T> {
    boolean test(T i);
}

public class LocalVariable {

    static String classVariable = "Class";
    String objectVariable = "Object";

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Cust<String> localC = s -> s.equals(classVariable);

        LocalVariable lv = new LocalVariable();

        Cust<String> localO = s -> s.equals(lv.objectVariable);

        String local = "OCP";
        int i = 0;
        Cust<String> localV = s -> {
            return s.equals(local);
        };
    }

}
