package Collections_Stage_1.Q2;

import java.util.Objects;

public class Student{

    private int roll_no;
    private String name;
    private float marks;

    public Student(int roll_no, String name, float marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public String getName() {
        return name;
    }

    public float getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }


    @Override
    public int hashCode() {
        return Objects.hash(marks);
    }
}
