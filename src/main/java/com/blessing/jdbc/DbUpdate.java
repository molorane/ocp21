package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUpdate {

    public static void main(String[] args) throws SQLException {
        Connection connection = DbConnector.connectToDb();
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM course WHERE name=\"Medicine\"")) {
            // first fetch the data and display it before the update operation
            System.out.println("Before the update");
            System.out.println("id \tfName \tlName");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name"));
            }
            // now update the resultset and display the modified data
            resultSet.absolute(1);
            resultSet.updateString("name", "Doctor");
            System.out.println("After the update");
        }

    }

}
