package Collections_Stage_1.Q8;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static LinkedList<Student> students = new LinkedList<>();

    public static void get_data(){
        Student s1 = new Student(1,88,78,80);
        Student s2 = new Student(1,98,88,85);
        Student s3 = new Student(3,100,100,100);
        Student s4 = new Student(4,86,77,66);
        Student s5 = new Student(5,80,67,86);
        Student s6 = new Student(5,86,65,61);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
    }

    public static void main(String[] args) {
        Main.get_data();

        // Sort By Id
//        Collections.sort(students,new SortById());
        // ID equal then sort by Maths
//        Collections.sort(students,new SortByMaths());
        // Maths equal then sort by Physics
//        Collections.sort(students,new SortByPhysics());
        for(Student s:students){
            System.out.println(s);
        }
    }
}
