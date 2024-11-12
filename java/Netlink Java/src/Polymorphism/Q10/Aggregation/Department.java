package Polymorphism.Q10.Aggregation;

import java.util.List;

public class Department {

    private String name;
    private List<Student> studentList;

    public Department(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public List<Student> getStudent(){
        return studentList;
    }
}