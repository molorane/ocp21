package com.blessing.trywithresource;

import java.io.Closeable;
import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class Main {

    static final R r1;
    int score = 0;

    static {
        r1 = new R("R1");
    }

    public Main() {
        Main.this.score = 5;
    }

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        assert 23 >= 5 : "No input";
        R r2 = new R("R2");
        try (r1; r2;) {
            System.out.println(r2);
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(":(");
        } finally {
            System.out.println("Can close");
        }

    }

    public void rethrowing() throws SQLException, DateTimeParseException {
        try {
            // parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        }
    }

}

class R implements Closeable {

    String name;

    public R(String name) {
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        // TODO Auto-generated method stub
        System.out.println("R closed. " + name);
    }

}
