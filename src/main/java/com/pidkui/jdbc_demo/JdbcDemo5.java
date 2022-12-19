package com.pidkui.jdbc_demo;

/*
 * 165 - JDBC with design pattern (DAO)
 * DAO - Data Access Object
 * Example - Creating a simple class for fetching student name just by passing roll number
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo5 {
    public static void main(String[] args) throws Exception {
        StudentDAO st = new StudentDAO();

        Student s1 = st.getStudent(4);
        System.out.println("Roll Number : " + s1.rollNo + "\nName : " + s1.name + "\nMarks : " + s1.marks);
    }
}

class StudentDAO {
    public Student getStudent(int rollNo) throws Exception {
        Student s = new Student();
        s.rollNo = rollNo;

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/pidkui";
        String userName = "shubham";
        String password = "pidkui";

        Connection con = DriverManager.getConnection(url, userName, password);

        Statement st = con.createStatement();

        String query = "SELECT name,marks FROM StudentJdbcDemo1 WHERE rollno=" + s.rollNo + ";";
        ResultSet rs = st.executeQuery(query);

        rs.next();
        s.name = rs.getString("name");
        s.marks = rs.getInt("marks");

        return s;
    }
}

class Student {
    int rollNo;
    String name;
    int marks;
}
