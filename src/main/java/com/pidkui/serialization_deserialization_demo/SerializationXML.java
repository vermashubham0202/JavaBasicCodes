package com.pidkui.serialization_deserialization_demo;

/*
116-Program to demonstrate serialization of Java Object in XML using XMLEncoder.
-> When you save the object state in Data format and after saving if the structure of the class changes
	then if you de-serialize it you will get an error.
-> In order to maintain that instead of saving object state in data format or text format we can save it
	in XML format.
-> Since XML is the most efficient data storage we can have, so we can transfer these XML files over the
	network also, and we retrieve the same information on other machines also.
*/

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationXML {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(1);
        s1.setName("Yogita");

        Student s2 = new Student();
        s2.setRollNo(2);
        s2.setName("Shubham");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);

        // assigning List to College
        College college = new College();
        college.setStudents(studentList);

        // XML encoder
        XMLEncoder xe = null;

        try {
            xe = new XMLEncoder(
                    new BufferedOutputStream(
                            new FileOutputStream("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/myCollege.xml")
                    )
            );
            xe.writeObject(college);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            xe.close();
        }
    }
}
