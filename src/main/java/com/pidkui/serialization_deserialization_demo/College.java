package com.pidkui.serialization_deserialization_demo;

/*
College class used in SerializationXML and DeserializationXML class.
*/

import java.util.List;

public class College {
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
