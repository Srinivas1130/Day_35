package com.bridgelabz.day35;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdatingDetailsOfPerson {
	public static Connection connection;
    public static void main(String[] args) throws SQLException {



        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "update addressbookforfriends set city='pune',address = 'hadpasar' where firstname='prafull' ";


        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected");
        statement.close();
        connection.close();
    }
}
