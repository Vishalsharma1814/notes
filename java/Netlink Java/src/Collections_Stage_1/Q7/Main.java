package Collections_Stage_1.Q7;

import Collections_Stage_1.Q5.SearchCollectionElement;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static ArrayList<Employee> employees = new ArrayList<>();

    public static void get_data(){
        Employee e1 = new Employee(101,"Rachit","Goyal",26000.00f,4);
        Employee e2 = new Employee(102,"Hemant","Mishra",30000.00f,5);
        Employee e3 = new Employee(103,"Praful","Kumar",23000.00f,3);
        Employee e4 = new Employee(104,"Mohan","Sharma",50000.00f,8);
        Employee e5 = new Employee(105,"Lalit","Agarwal",45000.00f,6);
        Employee e6 = new Employee(106,"Komal","Ansari",60000.00f,7);
        Employee e7 = new Employee(107,"Tushar","Srivastava",70000.00f,9);
        Employee e8 = new Employee(108,"Girish","Sharma",65000.00f,7);
        Employee e9 = new Employee(109,"Monika","Jaiswal",55000.00f,8);
        Employee e10 = new Employee(110,"Chanda","Singh",40000.00f,5);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);
    }

    public static void main(String[] args) {
        Main.get_data();
        Collections.sort(employees);
        for(Employee e:employees){
            System.out.println(e);
        }

    }

}
