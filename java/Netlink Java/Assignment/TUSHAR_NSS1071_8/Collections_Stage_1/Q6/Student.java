package Collections_Stage_1.Q6;

public class Student {

    private String studentName;
    private float mark;
    private String dob;
    private String college;

    public Student(String studentName, float mark, String dob, String college) {
        this.studentName = studentName;
        this.mark = mark;
        this.dob = dob;
        this.college = college;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }


    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", mark=" + mark +
                ", dob='" + dob + '\'' +
                ", college='" + college + '\'' +
                '}';
    }
}
