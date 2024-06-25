package com.blessing.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class getdriver {

    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        String url = "jdbc:mysql://localhost:3306/";
        Driver driver = DriverManager.getDriver(url);
        System.out.println(driver.getClass());

    }

}
