package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbQuery {


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDbWithProp();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM course")) {
            System.out.println("ID \tfName \tlName");
            while (resultSet.next()) {
                System.out.println(resultSet.getObject(1) + "\t" + resultSet.getString("name"));
            }
            // now update the resultset and display the modified data
            resultSet.absolute(1);
            resultSet.updateString("name", "Doctor");
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
