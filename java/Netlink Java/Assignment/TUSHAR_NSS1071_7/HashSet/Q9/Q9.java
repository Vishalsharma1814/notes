package HashSet.Q9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q9 {

    public static Set<Integer> integers = new HashSet<>();

    public static void get_data(){
        integers.add(89);
        integers.add(78);
        integers.add(77);
        integers.add(55);
        integers.add(45);
        integers.add(44);
        integers.add(89);
    }

    public static void main(String[] args) {
        Q9.get_data();
        ArrayList<Integer> integerList = new ArrayList<>(integers);
        System.out.println(integerList);
    }
}
