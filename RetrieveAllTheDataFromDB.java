package com.bridgelabz.day35;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveAllTheDataFromDB {
	 public static void main(String[] args) throws SQLException {

	        String jdbcUrl = "jdbc:mysql://localhost:3306/addressbookservice";
	        String userName = "root";
	        String password = "sopi@1234";
	        String query = "select * from addressbookforfriends";
	        Connection connection;

	        connection = DriverManager.getConnection(jdbcUrl, userName, password);
	        Statement statement = (Statement) connection.createStatement();
	        ResultSet result = ((java.sql.Statement) statement).executeQuery(query);

	        String userData = "";
	        while(result.next()){
	            userData = result.getString(1)+ " | " + result.getString(2)+" | " + result.getString(3)+" | "+result.getString(4)+" | "+result.getString(5)+" | "+result.getString(6);
	            System.out.println(userData);
	        }
	        statement.close();
	        connection.close();
	    }

	public String Query(String query1) {
		// TODO Auto-generated method stub
		return null;
	}

}
