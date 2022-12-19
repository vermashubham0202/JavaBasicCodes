package com.pidkui.jdbc_demo;

/* 161 - Program to demonstrate JDBC (Java Data Base Connectivity).
 * JDBC connects over java application with database.
 *
 * Steps to connect Java program with database:
 * 	1 - import the package. (java.sql.*)
 *  2 - load the drivers. (We have 4 different drivers for 4 different databases.)
 * 						  (Example: 	com.mysql.jdbc.Driver		mysql-connector)
 *    - and register it. 					Class.forName("com.mysql.jdbc.Driver");
 *  3 - establish the connection by instantiating Connection interface.
 *  4 - create the statement.	(Normal statement, prepared statement, call-able statement)
 *  5 - execute the query.
 *  6 - process results.
 *  7 - close the statement & connection.
 */

// step - 1: importing package
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {

        // default port of mysql is 3306
        String url = "jdbc:mysql://localhost:3306/pidkui";
        String userName = "shubham";
        String password = "pidkui";

        // step - 2: loading and registering driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // step - 3: establish the connection
        // getConnection() is a method in java which gives us an instance of Connection interface
        // and this method is a static method of DriverManager class
        Connection con = DriverManager.getConnection(url, userName, password);

        // step - 4: creating the statement
        // Statement is an interface
        Statement st = con.createStatement();

        // step - 5: executing the query
        // ResultSet is an interface
        String query = "SELECT * FROM StudentJdbcDemo1;";
        ResultSet rs = st.executeQuery(query);

        System.out.println("Roll No.	Name		Marks");
        // step - 6: processing result
        while (rs.next()) {
            System.out.println(rs.getInt("rollno") + "          " + rs.getString("name") + "		" + rs.getInt("marks"));
            // or use column index to print
//			System.out.println(rs.getInt(1) + "		" + rs.getString(2) + "		" + rs.getInt(3));
        }

        // step - 7: closing connections
        st.close();
        con.close();
    }
}
