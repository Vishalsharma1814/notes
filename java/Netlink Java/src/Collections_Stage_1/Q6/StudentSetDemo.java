package Collections_Stage_1.Q6;

import java.util.HashSet;

public class StudentSetDemo {

    public static HashSet<Student> students = new HashSet(16,0.75f);

    public static void get_data(){
        Student s1 = new Student("Lalit",98.89f,"19-10-2000","BBD");
        Student s2 = new Student("Komal",89.45f,"17-11-2001","BBD");
        Student s3 = new Student("Manish",97.65f,"06-09-2000","IET");
        Student s4 = new Student("Mahesh",95.67f,"04-05-1999","IET");

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
    }

    public static void main(String[] args) {

        StudentSetDemo.get_data();
        System.out.println(students);
    }
}
