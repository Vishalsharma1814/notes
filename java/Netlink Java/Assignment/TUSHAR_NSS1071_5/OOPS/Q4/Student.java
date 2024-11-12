package OOPS.Q4;

public class Student {

    int roll_number;
    int phone_number;
    String name;
    String address;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sam";
        s.roll_number=101;
        s.phone_number=9876;
        s.address="Lucknow";
        Student ss = new Student();
        ss.name = "John";
        ss.roll_number=102;
        ss.phone_number=7823;
        ss.address="Delhi";

        System.out.println(s.name+" "+s.roll_number+" "+s.phone_number+" "+s.address);
        System.out.println(ss.name+" "+ss.roll_number+" "+ss.phone_number+" "+ss.address);

    }
}
