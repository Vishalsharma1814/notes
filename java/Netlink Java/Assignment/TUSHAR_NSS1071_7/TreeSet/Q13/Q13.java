package TreeSet.Q13;

import TreeSet.Q12.Q12;

import java.util.TreeSet;

public class Q13 {

    public static TreeSet<Integer> tin = new TreeSet<>();

    public static void get_data(){
        tin.add(67);
        tin.add(55);
        tin.add(99);
        tin.add(34);
        tin.add(54);
        tin.add(23);
    }

    public static void main(String[] args) {

        Q13.get_data();
        System.out.println(tin.pollLast());
        System.out.println(tin);

    }
}
