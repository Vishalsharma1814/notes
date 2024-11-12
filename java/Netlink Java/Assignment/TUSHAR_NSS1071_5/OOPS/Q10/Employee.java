package OOPS.Q10;

public class Employee {

    String name;
    int yearJoin;
    String address;

    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println("Name"+" "+"Year of joining"+" "+"Address");
        e.name = "Robert";
        e.yearJoin = 1994;
        e.address= "64C-Walls Street";
        System.out.println(e.name+" "+e.yearJoin+" "+e.address);
        Employee ee = new Employee();
        ee.name = "Sam";
        ee.yearJoin = 2000;
        ee.address = "68D-Walls Street";
        System.out.println(ee.name+" "+ee.yearJoin+" "+ee.address);
        Employee eee = new Employee();
        eee.name = "John";
        eee.yearJoin = 1999;
        eee.address = "26B-Walls Street";
        System.out.println(eee.name+" "+eee.yearJoin+" "+eee.address);
    }
}
