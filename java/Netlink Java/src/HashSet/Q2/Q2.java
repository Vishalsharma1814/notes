package HashSet.Q2;

import java.util.HashSet;
import java.util.Set;

public class Q2 {

    public static Set<Integer> hh = new HashSet<>();

    public static void get_data(){
        hh.add(11);
        hh.add(34);
        hh.add(10);
        hh.add(89);
        hh.add(65);
        hh.add(34);
    }

    public static void main(String[] args) {
        Q2.get_data();
        for(Integer i:hh){
            System.out.println(i);
        }
    }
}
