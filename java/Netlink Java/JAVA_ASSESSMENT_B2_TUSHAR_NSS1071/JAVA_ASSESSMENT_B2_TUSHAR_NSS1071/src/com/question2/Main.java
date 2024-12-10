package com.question2;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    static ArrayList<Employee> employees1 = new ArrayList<>();
    static ArrayList<Employee> employees2 = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();

    public static void get_data(){

        // Step 1

        Employee e1 = new Employee(101,"Hemant","hem12@gmail.com",845272112,30000,"Developer",true,21);
       Employee e2 = new Employee(102,"Kunal","ku13@gmail.com",845272123,35000,"Senior Developer",true,33);
       Employee e3 = new Employee(103,"Manish","ma45@gmail.com",845272124,40000,"Business Analyst",true,25);
       Employee e4 = new Employee(104,"Lalit","ll56@gmail.com",845272125,20000,"Trainee",true,21);
        Employee e5 = new Employee(105,"Naresh","na33@gmail.com",845272126,33000,"Developer",true,23);
        Employee e6 = new Employee(106,"Kritika","kt11@gmail.com",84527227,31000,"Business Analyst",true,22);
        Employee e7 = new Employee(107,"Karunesh","kh01@gmail.com",845272128,45000,"Manager",true,36);
       Employee e8 = new Employee(108,"Komal","kl90@gmail.com",845272129,25000,"Business Analyst",false,24);
        Employee e9 = new Employee(109,"Sujit","st23@gmail.com",845272130,32000,"Manager",true,20);
        Employee e10 = new Employee(110,"Sumesh","sh11@gmail.com",845272131,34000,"Developer",false,22);
        Employee e11 = new Employee(111,"Rachit","ra88@gmail.com",845272132,25000,"System Engineer",true,23);
        Employee e12 = new Employee(112,"Pratibha","pa44@gmail.com",845272133,40000,"Senior Developer",true,35);
        Employee e13 = new Employee(113,"Priya","pa44@gmail.com",845272134,46000,"Manager",true,25);
        Employee e14 = new Employee(114,"Satyam","am65@gmail.com",845272135,34000,"Developer",false,22);
        Employee e15 = new Employee(115,"Yogendra","ya48@gmail.com",845272136,65000,"Developer",true,23);

        Employee e16 = new Employee(1,"Nakul","ku13@gmail.com",845272137,25000,"Business Analyst",true,31);
        Employee e17 = new Employee(2,"Satyam","ph55@gmail.com",845272138,60000,"Developer",true,21);
        Employee e18 = new Employee(3,"Yamini","yi21@gmail.com",845272139,36000,"Senior Developer",false,40);
        Employee e19 = new Employee(4,"Girish","gh37@gmail.com",845272140,37000,"Business Analyst",true,22);
        Employee e20 = new Employee(5,"Harshita","ha22@gmail.com",845272141,40000,"Senior Developer",true,26);
        Employee e21 = new Employee(6,"Richa","ri11@gmail.com",845272142,34000,"Developer",false,22);
        Employee e22 = new Employee(7,"Royal","ro88@gmail.com",845272143,25000,"System Engineer",true,23);
        Employee e23 = new Employee(8,"Priyansh","pp44@gmail.com",845272144,40000,"Senior Developer",true,35);
        Employee e24 = new Employee(9,"Komal","pk44@gmail.com",845272145,46000,"Manager",true,25);
        Employee e25 = new Employee(10,"Sumit","su65@gmail.com",845272146,34000,"Developer",false,22);
        Employee e26 = new Employee(11,"Akshat","ak48@gmail.com",845272147,65000,"Developer",true,23);
        Employee e27 = new Employee(12,"Narendra","nan13@gmail.com",845272148,25000,"Business Analyst",true,31);
        Employee e28 = new Employee(13,"Kamlesh","klh55@gmail.com",845272149,60000,"Developer",true,21);
        Employee e29 = new Employee(14,"Garima","ga21@gmail.com",845272150,36000,"Senior Developer",false,40);
        Employee e30 = new Employee(15,"Divyanshu","dy37@gmail.com",845272151,37000,"Business Analyst",true,22);

        employees1.add(e1);
        employees1.add(e2);
        employees1.add(e3);
        employees1.add(e4);
        employees1.add(e5);
        employees1.add(e6);
        employees1.add(e7);
        employees1.add(e8);
        employees1.add(e9);
        employees1.add(e10);
        employees1.add(e11);
        employees1.add(e12);
        employees1.add(e13);
        employees1.add(e14);
        employees1.add(e15);


        employees1.add(e16);
        employees1.add(e17);
        employees1.add(e18);
        employees1.add(e19);
        employees1.add(e20);
        employees1.add(e21);
        employees1.add(e22);
        employees1.add(e23);
        employees1.add(e24);
        employees1.add(e25);
        employees1.add(e26);
        employees1.add(e27);
        employees1.add(e28);
        employees1.add(e29);
        employees1.add(e30);

    }

    public static void main(String[] args) {
        Main.get_data();

        employees.addAll(employees1);
        employees.addAll(employees2);
        // Scenario 2
        System.out.println("------------------------Scenario 2---------------------------------------------------------");
        List<Employee> e1 = employees.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());
        e1.stream().filter(employee -> employee.getSalary()<40000).map(employee -> {
            return employee.getName();
        }).distinct().forEach(System.out::println);

        // Scenario 3
        System.out.println("----------------------------------Scenario 3-------------------------------------------------");
        List<Employee> e2 = employees.stream().sorted(((o1, o2) -> o1.getName().compareTo(o2.getName()))).collect(Collectors.toList());
        e2.stream().map(employee -> {
            return employee.getName();
        }).distinct().forEach(System.out::println);

        // Scenario 4
        System.out.println("----------------------------------Scenario 4----------------------------------------------------------");
        HashSet<Employee> dup = new HashSet<>(employees);

        Set<Employee> e3 = dup.stream().filter(employee -> !dup.add(employee)).collect(Collectors.toSet());
        e3.stream().map(employee -> {
            employee.getName();
            return employee;
        }).forEach(System.out::println);

        // Scenario 5
        System.out.println("---------------------------------------Scenario 5---------------------------------------------------------");
        Long emp_num = employees.stream().filter(employee -> employee.getDesignation().contains("Manager")).mapToInt(employee->employee.getId()).count();
        System.out.println(emp_num);




    }
}
