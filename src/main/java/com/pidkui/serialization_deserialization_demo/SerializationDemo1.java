package com.pidkui.serialization_deserialization_demo;

/*
115-Program to demonstrate serialization of Java Object.
-> Serialization : Saving the state of an Object in a file.
*/

import java.io.*;

public class SerializationDemo1 {
    public static void main(String[] args) throws Exception {
        // Serialization is used to store the state(values) of the object
        // So that if we again create object we can retrieve all its value
        Save obj1 = new Save();
        obj1.i = 5;

        // saving object state to a file
        File file = new File("/home/shubham/idea-workspace/JavaBasicCodes/inputOutputFiles/object.txt");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj1);    // obj1 state will be saved in object.txt

        // retrieving object from a file
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Save obj2 = (Save) ois.readObject();    // ois.readObject(); will return the object of Object class
                                                // so we need to type cast it to Save class' object

        System.out.println("Value of obj2: " + obj2.i);
    }
}

class Save implements Serializable {
    int i;
}
