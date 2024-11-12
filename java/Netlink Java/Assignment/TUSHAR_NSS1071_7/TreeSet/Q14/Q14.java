package TreeSet.Q14;

import java.util.TreeSet;

public class Q14 {

    public static TreeSet<Integer> integers= new TreeSet<>();

    public static void get_data(){
        integers.add(67);
        integers.add(55);
        integers.add(99);
        integers.add(34);
        integers.add(54);
        integers.add(23);
    }

    public static void main(String[] args) {

        Q14.get_data();
        integers.remove(54);
        System.out.println(integers);
    }
}
