package Polymorphism.Q10.Aggregation;

import java.util.List;

public class Institute {

    private String name;
    private List<Department> departmentList;

    public Institute(String name, List<Department> departmentList) {
        this.name = name;
        this.departmentList = departmentList;
    }

    // Count total number od students in all department

    public int getTotalStudent(){

        int c = 0;

        List<Student> student; // Reference

        for(Department department:departmentList){
            student = department.getStudent();
            for(Student s:student){
                c++;
            }
        }
        return c;
    }

}
