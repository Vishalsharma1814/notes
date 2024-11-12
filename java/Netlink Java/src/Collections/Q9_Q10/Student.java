package Collections.Q9_Q10;

public class Student implements Comparable<Student>{

    private int roll_no;
    private String name;
    private int age;

    public Student(int roll_no, String name, int age) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    // In natural order
    public int compareTo(Student s){
        return age - s.age;
    }

//    @Override
//    // In reverse order
//    public int compareTo(Student s){
//        return s.age - age;
//    }


}
