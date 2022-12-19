package com.pidkui.jdbc_demo;

/*
 * 163 - Program to demonstrate PreparedStatement.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo3 {
    public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/pidkui";
        String userName = "shubham";
        String password = "pidkui";

        // loading and registering driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, userName, password);

        int rollNo = 5;
        String name = "Narendra";
        int marks = 95;

        String query = "INSERT INTO StudentJdbcDemo1 VALUES (?,?,?)";
        // creating the prepared statement
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1, rollNo);
        st.setString(2, name);
        st.setInt(3, marks);

        // don't write 'query' as a parameter of executeUpdate() method now, mentioned in prepareStatement()
        int rowsAffected = st.executeUpdate();

        System.out.println(rowsAffected + " row(s) affected!");

        // closing connections
        st.close();
        con.close();
    }
}
