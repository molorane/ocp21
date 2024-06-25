package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class wrongheader {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try (Connection connection = DbConnector.connectToDbWithProp();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM "
                     + "course")) {
            System.out.println(connection.nativeSQL("SELECT * FROM course c, account a"));
            // from resultSet metadata, find out how many columns there are
            // and then read the column entries
            int numOfColumns = resultSet.getMetaData().getColumnCount();
            while (resultSet.next()) {
                // remember that the column index starts from 1 not 0
                for (int i = 1; i <= numOfColumns; i++) {
                    // since we do not know the data type of the column, we use getObject()
                    System.out.print(resultSet.getObject(i) + "\t");
                }
                System.out.println("");
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}
