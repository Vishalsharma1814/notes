package Collections_Stage_1.Q2;

import java.util.Comparator;

public class MaxMarks implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o2.getMarks() - o1.getMarks());
    }
}
