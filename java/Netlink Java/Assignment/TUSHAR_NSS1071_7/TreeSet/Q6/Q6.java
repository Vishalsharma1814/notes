package TreeSet.Q6;

import java.util.TreeSet;

public class Q6 {

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

        Q6.get_data();
        TreeSet<Integer> new_treeset = (TreeSet<Integer>) integers.clone();
        System.out.println("Clone tree set: ");
        System.out.println(new_treeset);
    }
}
