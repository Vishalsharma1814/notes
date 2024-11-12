package Polymorphism.Q10.Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student st1 = new Student("Tushar",21);
        Student st2 = new Student("Harshit",20);
        Student st3 = new Student("Hemant",22);
        Student st4 = new Student("Naresh",23);
        Student st5 = new Student("Harsh",21);
        Student st6 = new Student("Komal",20);
        Student st7 = new Student("Mayank",22);
        Student st8 = new Student("Tarang",23);

        List<Student> list = new ArrayList<>(); // For Department CSE
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);

        List<Student> list1 = new ArrayList<>(); // For Department IT
        list1.add(st5);
        list1.add(st6);
        list1.add(st7);
        list1.add(st8);

        Department d1 = new Department("CSE",list);
        Department d2 = new Department("IT",list1);

        List<Department> dl = new ArrayList<>();
        dl.add(d1);
        dl.add(d2);

        Institute i = new Institute("BBD",dl);
        System.out.println("Number of students: "+i.getTotalStudent());

    }
}