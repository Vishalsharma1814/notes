package TreeSet.Q12;

import java.util.TreeSet;

public class Q12 {
    
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

        Q12.get_data();
        System.out.println(tin.pollFirst());
        System.out.println(tin);
        
    }
}
