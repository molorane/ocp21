package com.blessing.test;

import java.io.Closeable;
import java.sql.SQLException;

public class AutocloseableFlow {
    static class Door implements AutoCloseable {
        public void close() throws Exception {
            System.out.println("D");
            throw new Exception();
        }
    }

    static class Window implements Closeable {
        public void close() {
            System.out.println("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {

        try (Window w = new Window()) {
            throw new ArithmeticException();
        }
    }

    public void read() throws Exception {
        try {
            readFromDatabase();
        } catch (Exception e) {
            throw e;
        }
    }

    private void readFromDatabase() throws SQLException {
    }
}