package com.blessing.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

    public static void main(String[] args) {
        try (Connection connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = statement.executeQuery("select id from country order by id")) {
            //rs.afterLast();
            System.out.println(rs.relative(2));

            rs.close();
            statement.close();
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }

}
