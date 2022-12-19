package com.pidkui.file_handling_demo;

/*
112-Program to demonstrate file handling in Java.
*/

import java.io.*;

public class FileHandlingDemo1 {
    public static void main(String[] args) throws Exception {
        File f = new File("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/fileHandlingDemo1.txt");

        // writing data to file
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Welcome to Java programming!");

        // reading data from file
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();

        System.out.println(str);
    }
}
