package OOPS.Q3;

public class Student {

    int roll_no;
    String name;

    public static void main(String[] args) {
        Student ss = new Student();
        ss.roll_no = 2;
        ss.name = "John";
        System.out.println("Student's Roll No. : "+ss.roll_no);
        System.out.println("Student's Name : "+ss.name);
    }
}
