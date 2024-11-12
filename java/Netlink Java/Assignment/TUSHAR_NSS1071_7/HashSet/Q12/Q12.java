package HashSet.Q12;

import java.util.HashSet;
import java.util.Set;

public class Q12 {

    public static Set<Integer> integers = new HashSet<>();

    public static void get_data(){
        integers.add(34);
        integers.add(56);
        integers.add(78);
        integers.add(98);
        integers.add(54);
        integers.add(33);
    }

    public static void main(String[] args) {

        Q12.get_data();
        System.out.println("Original Hash set: ");
        System.out.println(integers);

        System.out.println("After removing all values from hash set: ");
        integers.removeAll(integers);
        System.out.println(integers);
    }
}
