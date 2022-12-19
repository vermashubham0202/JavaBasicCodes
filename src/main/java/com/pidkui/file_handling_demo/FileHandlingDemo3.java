package com.pidkui.file_handling_demo;

/*
114-Program to demonstrate reading values from properties files in Java.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileHandlingDemo3 {
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		File f = new File("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/dataconfig.properties");
		
		// to fetch data from a file we use InputStream
		InputStream is  = new FileInputStream(f);
		p.load(is);

		// printing properties object
		System.out.println(p);
		// printing specific property (value by passing key)
		System.out.println(p.getProperty("url"));
		// listing properties keys-values
		p.list(System.out);
	}
}
