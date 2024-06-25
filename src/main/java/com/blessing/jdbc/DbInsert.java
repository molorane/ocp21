package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbInsert {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,
                     ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM course")) {
            System.out.println("Before the insert");
            System.out.println("id \tName");

            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name") + "\t");
            }
            resultSet.moveToInsertRow();
            resultSet.updateString("name", "Lefa");
            resultSet.insertRow();
            System.out.println("After the insert");
            System.out.println("id \tName");
            resultSet.beforeFirst();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + "\t" + resultSet.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}