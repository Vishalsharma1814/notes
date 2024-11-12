package HashSet.Q8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Q8 {

    public static HashSet hash = new HashSet();

    public static void get_data(){
        hash.add("Yellow");
        hash.add("Red");
        hash.add("Orange");
        hash.add("Pink");
        hash.add("Purple");
        hash.add("Red");
    }

    public static void main(String[] args) {
        Q8.get_data();
//        Set<String> ss = new TreeSet<>(hash);

        TreeSet ts = new TreeSet(hash);
        System.out.println(ts);
    }
}
