package Collections_Stage_1.Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {

    public static List<Student> students = new ArrayList<>();

    public static void get_data(){
        Student s1 = new Student(101,"Roshan",100);
        Student s2 = new Student(102,"Hemant",88);
        Student s3 = new Student(103,"Harshit",100);
        Student s4 = new Student(104,"Prakhar",78);
        Student s5 = new Student(105,"Sakshi",66);
        Student s6 = new Student(106,"Satyam",100);
        Student s7 = new Student(107,"Kashish",56);
        Student s8 = new Student(108,"Tushar",100);
        Student s9 = new Student(109,"Mohan",88);
        Student s10 = new Student(110,"Girish",45);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        students.add(s7);
        students.add(s8);
        students.add(s9);
        students.add(s10);

        }

    public static void main(String[] args) {

        Q2.get_data();
        //
        Collections.sort(students,new MaxMarks());
        System.out.println("Highest marks in class: ");
       for(int i=0;i<students.size();i++){
           if(students.get(i).getMarks() == students.get(0).getMarks()){
               System.out.println(students.get(i).getName()+" "+students.get(i).getMarks());
           }
        }

        System.out.println("------------------------------------------");

        System.out.println("Least marks in class: ");
        for(int i=0;i<students.size();i++){
            if(students.get(i).getMarks() == students.get(students.size()-1).getMarks()){
                System.out.println(students.get(i).getName()+" "+students.get(i).getMarks());
            }
        }

    }
}
