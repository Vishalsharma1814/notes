package TreeSet.Q7;

import TreeSet.Q6.Q6;

import java.util.TreeSet;

public class Q7 {

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

        Q7.get_data();
        System.out.println("Number of elements in a integers tree set: "+integers.size());
    }
}
