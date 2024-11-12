package TreeSet.Q3;

import java.util.Set;
import java.util.TreeSet;

public class Q3 {

    public static Set<Integer> integers = new TreeSet<>();
    public static Set<Integer> integers_1 = new TreeSet<>();

    public static void get_data(){
        integers.add(12);
        integers.add(56);
        integers.add(98);
        integers.add(45);
        integers.add(65);
        integers.add(33);

        integers_1.add(45);
        integers_1.add(44);
        integers_1.add(99);
        integers_1.add(65);
        integers_1.add(77);
        integers_1.add(22);
        integers_1.add(11);

    }

    public static void main(String[] args) {
        Q3.get_data();

        integers.addAll(integers_1);
        System.out.println(integers);
    }
}
