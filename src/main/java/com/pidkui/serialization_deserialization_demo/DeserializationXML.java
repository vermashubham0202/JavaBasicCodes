package com.pidkui.serialization_deserialization_demo;

/*
117-Program to demonstrate Deserialization of Java Object in XML using XMLEncoder.
*/

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeserializationXML {
    public static void main(String[] args) {
        // XML decoder
        XMLDecoder xd = null;

        try {
            xd = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/myCollege.xml")
                    )
            );

            College college = (College) xd.readObject();
            List<Student> studentList = college.getStudents();

            for (Student student : studentList) {
                System.out.println(student);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            xd.close();
        }
    }
}
