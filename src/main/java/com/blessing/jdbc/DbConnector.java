package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbConnector {
    public static Connection connectToDb() throws SQLException {
        String url = "jdbc:mysql://localhost/";
        String database = "sealapp?serverTimezone=UTC";
        String userName = "root";
        String password = "Blessing**4";
        Driver driver = DriverManager.getDriver(url);
        //return DriverManager.getConnection(url + database+"&password="+ password+"&user="+ userName);
        return DriverManager.getConnection(url + database, userName, password);
    }

    public static Connection connectToDbWithProp() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/sealapp?serverTimezone=UTC";
        Properties p = new Properties();
        p.setProperty("user", "root");
        p.setProperty("password", "Blessing**4");
        return DriverManager.getConnection(url, p);
    }
}