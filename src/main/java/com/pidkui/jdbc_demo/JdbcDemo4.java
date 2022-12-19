package com.pidkui.jdbc_demo;

/*
 * 164 - Class.forName() is used in JDBC to load and register database driver.
 *
 * Class.forName("com.mysql.cj.jdbc.Driver");	=	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 */

import java.sql.SQLException;

public class JdbcDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        // whenever you create an object of a class, then class will be
        // loaded as well as static block will be called
//        Pqr obj = new Pqr();

        // instead of using below code we are using Class.forName() to register the drivers
//        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        // below code is same as above code
//        Class.forName("com.mysql.cj.jdbc.Driver");
                                                          /*  This code internally called the
                                                            static block of Class 'Driver'
                                                            and that static block internally
                                                            called DriverManager.registerDriver()    */

        // we want to call the static block of class Pqr without creating object of it
        // forName() : It will load the class
        Class.forName("com.pidkui.jdbc_demo.Pqr").newInstance();
    }
}

class Pqr {
    // static block
    static {
        System.out.println("In static block");
    }

    // instance block
    {
        System.out.println("In instance block");
    }
}
