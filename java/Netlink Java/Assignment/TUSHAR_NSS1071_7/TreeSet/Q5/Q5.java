package TreeSet.Q5;

import java.util.Set;
import java.util.TreeSet;

public class Q5 {

    public static TreeSet<Integer> integers = new TreeSet<>();

    public static void get_data(){
        integers.add(45);
        integers.add(44);
        integers.add(99);
        integers.add(65);
        integers.add(77);
        integers.add(22);
        integers.add(11);
    }

    public static void main(String[] args) {
        Q5.get_data();
        System.out.println("First element: "+integers.first());
        System.out.println("Last element: "+integers.last());
    }
}
