package Collections_Stage_1.Q8;

import java.util.Comparator;

public class SortByMaths implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getId() == o2.getId()){
            return o1.getMaths() - o2.getMaths();
        }
        return 1;
    }
}
