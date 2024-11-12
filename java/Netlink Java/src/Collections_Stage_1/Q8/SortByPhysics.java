package Collections_Stage_1.Q8;

import java.util.Comparator;

public class SortByPhysics implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMaths() == o2.getMaths()){
            return o1.getPhysics() - o2.getPhysics();
        }
        return 1;
    }
}
