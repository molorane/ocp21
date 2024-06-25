package com.blessing.trywithresource;

public class AutoCloseableFlow {

    static class Door implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("D");
            throw new ArithmeticException("Door");
        }
    }

    static class Window implements AutoCloseable {
        @Override
        public void close() throws Exception {
            System.out.println("W");
            throw new RuntimeException("Window");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        try (var d = new Door();
             var w = new Window()) {
            System.out.println("T");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("F");
        }
    }

}
