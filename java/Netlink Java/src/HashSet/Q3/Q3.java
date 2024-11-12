package HashSet.Q3;

import java.util.HashSet;
import java.util.Set;

public class Q3 {

    public static Set hash = new HashSet();

    public static void get_data(){
        hash.add("Yellow");
        hash.add("Red");
        hash.add(67);
        hash.add(55);
        hash.add("Purple");
        hash.add("Orange");
    }

    public static void main(String[] args) {
        Q3.get_data();
        System.out.println("Number of elements in hash set: "+hash.size());
    }
}
