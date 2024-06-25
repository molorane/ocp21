package com.blessing.jdbc;

import java.sql.*;

public class demo {

    Statement st;
    PreparedStatement ps;
    CallableStatement cs;
    DriverManager dm;

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String url = "jdbc:mysql://localhost:3306/";
        // we are connecting to the addressBook database we created earlier
        String database = "addressBook";
        // we login as "root" user with password "mysql123"
        String userName = "root";
        String password = "mysql123";

        try (Connection connection = DriverManager.getConnection(url + database, userName, password)) {
            System.out.println("Database connection: Successful");
        } catch (Exception e) {
            System.out.println("Database connection: Failed");
            e.printStackTrace();
        }

    }

}
