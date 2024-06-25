package com.blessing.jdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class DbCreateTable {
    public static void main(String[] args) {
        try (var connection = DbConnector.connectToDb();
             Statement statement = connection.createStatement()) {
            // use CREATE TABLE SQL statement to
            // create table familyGroup
            statement.executeUpdate(
                    "CREATE TABLE familyGroup (id int not null auto_increment, nickName varchar(30) not null, primary key(id));");
            System.out.println("Table created successfully");
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.exit(-1);
        }
    }
}