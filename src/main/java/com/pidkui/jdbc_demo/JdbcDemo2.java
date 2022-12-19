package com.pidkui.jdbc_demo;

/*
 * 162 - Program to demonstrate JDBC (INSERT Statement)
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String url = "jdbc:mysql://localhost:3306/pidkui";
		String userName = "shubham";
		String password = "pidkui";

		// loading and registering driver
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(url, userName, password);

		// creating the statement
		Statement st = con.createStatement();

		// executing the query
		int rollNo = 4;
		String name = "Anita";
		int marks = 100;
		
		// this is not the best way to do (if we have so many coloumns)
		// we can use prepared statement instead
		String query = "INSERT INTO StudentJdbcDemo1 VALUES (" + rollNo + ", '" + name +"', '"+ marks +"')";
		
		// executeUpdate() for DML
		int rowsAffected = st.executeUpdate(query);

		System.out.println(rowsAffected + " row(s) affected!");
		
		// closing connections
		st.close();
		con.close();
	}
}
