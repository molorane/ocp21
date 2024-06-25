package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Mothusi Molorane
 */
public class DbDelete {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                     ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet1 = statement.executeQuery("SELECT * FROM course WHERE name=\"John\"")) {
            if (resultSet1.next()) {
                //delete the first row
                resultSet1.deleteRow();
            }
            resultSet1.close();
            //now fetch again from the database
            try (ResultSet resultSet2 = statement.executeQuery("SELECT * FROM course")) {
                System.out.println("After the deletion");
                System.out.println("id \tfName");
                while (resultSet2.next()) {
                    System.out.println(resultSet2.getInt("id") + "\t" + resultSet2.getString("name"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
}