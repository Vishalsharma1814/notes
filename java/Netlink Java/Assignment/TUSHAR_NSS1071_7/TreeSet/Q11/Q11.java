package TreeSet.Q11;

import java.util.TreeSet;

public class Q11 {

    public static TreeSet<Integer> integers = new TreeSet<>();

    public static void get_data() {
        integers.add(67);
        integers.add(55);
        integers.add(99);
        integers.add(34);
        integers.add(54);
        integers.add(23);

    }

    public static void main(String[] args) {
        Q11.get_data();
        System.out.println("Numbers less than equal to 78: ");
        System.out.println(integers.floor(78));
    }
}
