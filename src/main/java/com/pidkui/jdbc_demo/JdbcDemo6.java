package com.pidkui.jdbc_demo;

/*
 * 166 - JDBC with design pattern (DAO)
 * DAO - Data Access Object
 * Example - Creating a simple class for inserting student data
 * Use prepared statement this time for insertion
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo6 {
	public static void main(String[] args) throws Exception {
		StudentDAO2 st = new StudentDAO2();
		Student2 s1 = new Student2();

		s1.rollNo = 6;
		s1.name = "Shivam";
		s1.marks = 56;
		
		int row_affected = st.addStudent(s1);
		System.out.println(row_affected  + " row(s) affected!");
	}
}

class StudentDAO2 {
	public int addStudent(Student2 s) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/pidkui";
		String userName = "shubham";
		String password = "pidkui";
		
		Connection con = DriverManager.getConnection(url, userName, password);
		
		String query = "INSERT INTO StudentJdbcDemo1 VALUES(?,?,?)";
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, s.rollNo);
		st.setString(2, s.name);
		st.setInt(3, s.marks);
		
		int rowsAffected = st.executeUpdate();
		
		return rowsAffected;
	}
}

class Student2 {
	int rollNo;
	String name;
	int marks;
}
