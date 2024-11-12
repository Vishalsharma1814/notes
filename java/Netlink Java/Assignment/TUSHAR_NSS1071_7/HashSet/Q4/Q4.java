package HashSet.Q4;

import java.util.HashSet;
import java.util.Set;

public class Q4 {

    public static Set<Integer> integerSet = new HashSet<>();

    public static void get_data(){
        integerSet.add(56);
        integerSet.add(67);
        integerSet.add(45);
        integerSet.add(98);
        integerSet.add(33);
        integerSet.add(65);
    }

    public static void main(String[] args) {
        Q4.get_data();
        integerSet.removeAll(integerSet);
        System.out.println(integerSet);
    }
}
