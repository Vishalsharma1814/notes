package TreeSet.Q9;

import java.util.TreeSet;

public class Q9 {

    public static TreeSet<Integer> integerTreeSet = new TreeSet<>();

    public static void get_data(){
        integerTreeSet.add(4);
        integerTreeSet.add(0);
        integerTreeSet.add(5);
        integerTreeSet.add(9);
        integerTreeSet.add(10);
        integerTreeSet.add(6);
        integerTreeSet.add(89);
    }

    public static void main(String[] args) {
        Q9.get_data();
        TreeSet<Integer> h = (TreeSet<Integer>) integerTreeSet.headSet(7);
        for(Integer i:h){
            System.out.println(i);
        }
    }
}
