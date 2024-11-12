package HashSet.Q7;

import java.util.HashSet;
import java.util.Set;

public class Q7 {

    public static Set<Integer> integerSet = new HashSet<>();

    public static void get_date(){
        integerSet.add(23);
        integerSet.add(78);
        integerSet.add(90);
        integerSet.add(76);
        integerSet.add(55);
        integerSet.add(23);

    }

    public static void main(String[] args) {
        Q7.get_date();
        integerSet.toArray(new Integer[0]);

        System.out.println(integerSet);
    }
}
