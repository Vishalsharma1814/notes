package OOPS.Q1;

public class Student {

    public String name;
    public Student(String n){
        name = n;
    }
    public Student(){
        name = "unknowm";
    }

    public static void main(String[] args) {
        Student s = new Student("Tushar");
        Student un = new Student();

        System.out.println(s.name);
        System.out.println(un.name);
    }

}
