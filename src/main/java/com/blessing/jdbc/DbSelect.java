package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbSelect {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM course")) {

            System.out.println("ID \tfName \tlName");
            //resultSet.absolute(-12);
            while (resultSet.next()) {
                System.out.println(resultSet.getObject(1) + "\t" + resultSet.getString("name"));
            }
            // now update the resultset and display the modified data
            resultSet.absolute(0);
            System.out.println("After the update");
            System.out.println("id \tfName \tlName");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name"));
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
