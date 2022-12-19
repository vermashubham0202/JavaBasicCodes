package com.pidkui.file_handling_demo;

/*
113-Program to demonstrate properties files in Java.
-> Every property file will have a key and a value.
-> In one property file we can have multiple keys and multiple values.
-> For example, to access a database we need three things - url of database, user-name and password
   So, we can write these three things in property file, and we can fetch this later.
*/

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Properties;

public class FileHandlingDemo2 {
    public static void main(String[] args) throws Exception {
        // need a Properties' object for storing information to property file
        Properties p = new Properties();

        // we need object of OutputStream to store data outside
        OutputStream os = new FileOutputStream("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/dataconfig.properties");

        // setting values to property file
        p.setProperty("url", "localhost:3306/myDB");
        p.setProperty("uname", "shubham");
        p.setProperty("pass", "pidkui");

        // storing properties using OutputStream object
        p.store(os, null);
    }
}
