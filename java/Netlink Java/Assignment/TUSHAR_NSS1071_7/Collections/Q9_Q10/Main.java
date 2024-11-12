package Collections.Q9_Q10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<Student> studentList = new ArrayList<>();

    public static void getData(){
        Student s1 = new Student(101,"Tushar",21);
        Student s2 = new Student(102,"Harshit",20);
        Student s3 = new Student(103,"Aakash",22);
        Student s4 = new Student(104,"Hemant",23);
        Student s5 = new Student(105,"Kunal",19);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
    }

    public static void main(String[] args) {

        Main.getData();
        Collections.sort(studentList);
        for(Student ss:studentList)
        {
            System.out.println(ss);
        }
    }
}
