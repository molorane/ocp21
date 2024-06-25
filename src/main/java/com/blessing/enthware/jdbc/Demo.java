package com.blessing.enthware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

    public static void main(String[] args) throws SQLException {

        Statement st = null;
        Connection con = DriverManager.getConnection("", "", "");

    }

}
