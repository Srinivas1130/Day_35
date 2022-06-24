package com.bridgelabz.day35;
import java.sql.*;

public class UpdateNewContactToDatabase {
	public static Connection connection;
    public static void main(String[] args) throws SQLException {
        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
        String userName = "root";
        String password = "sopi@1234";
        String query = "update addressbookforfriends set phone='8600127352' where firstname='prafull' ";


        connection = DriverManager.getConnection(jdbcUrl, userName, password);
        PreparedStatement statement = connection.prepareStatement(query);
        int count = statement.executeUpdate();
        System.out.println(count + " row affected");
        statement.close();
        connection.close();
    }

}
