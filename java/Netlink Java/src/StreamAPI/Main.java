package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static ArrayList<Employee> arrayList = new ArrayList<>();

    public static void printData(){
        Employee e1 = new Employee(101,"Tushar","UDAAN",21,50000);
        Employee e2 = new Employee(102,"Harshit","UDAAN",20,40000);
        Employee e3 = new Employee(103,"Lokesh","UDAAN",30,30000);
        Employee e4 = new Employee(104,"Dinesh","UDAAN",26,45000);
        Employee e5 = new Employee(105,"Akshay","NDS",26,60000);
        Employee e6 = new Employee(106,"Ayushi","NDS",23,50000);
        Employee e7 = new Employee(107,"Vishal","UDAAN",22,40000);
        Employee e8 = new Employee(108,"Raj","UDAAN",23,42000);
        Employee e9 = new Employee(109,"Abhishek","UDAAN",22,41000);
        Employee e10 = new Employee(110,"Ishika","UDAAN",22,35000);
        Employee e11 = new Employee(111,"Deepika","UDAAN",23,50000);

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);
        arrayList.add(e5);
        arrayList.add(e6);
        arrayList.add(e7);
        arrayList.add(e8);
        arrayList.add(e9);
        arrayList.add(e10);
        arrayList.add(e11);

    }

    public static void main(String[] args) {
        Main.printData();

        System.out.println("Those employee info whose salary greater then 40000......");
        arrayList.stream().filter(i->i.getSalary()>40000).forEach(System.out::println);

        System.out.println("Those empolyee whose age is greater than 20 and department is UDAAN.....");
        List<Employee> collect = arrayList.stream().filter(i->i.getDeptName().contains("UDAAN")).filter(i->i.getAge()>20).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        System.out.println("Employee UDAAN -> DSG....");
        List<Employee> dept = arrayList.stream().map(employee -> {
            employee.setDeptName("DSG");
            return employee;
        }).collect(Collectors.toList());
        dept.stream().forEach(System.out::println);

        System.out.println("Department->UDAAN and salary -> ++50000");
        List<Employee> lt = arrayList.stream().filter(employee -> employee.getDeptName().contains("DSG")).collect(Collectors.toList());
        lt.stream().map(employee -> {
            employee.setSalary(50000+ employee.getSalary());
            return employee;
        }).forEach(System.out::println);

    }
}
