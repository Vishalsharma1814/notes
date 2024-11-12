package TreeMap.Q15;

import java.util.TreeMap;

public class Q15 {
    public static TreeMap<Integer,String> tree = new TreeMap<>();

    public static void get_data(){
        tree.put(10,"B1");
        tree.put(11,"B2");
        tree.put(15,"B3");
        tree.put(13,"B4");
        tree.put(20,"B5");
    }

    public static void main(String[] args) {
        Q15.get_data();
        System.out.println(tree.lowerKey(9));
        System.out.println(tree.lowerKey(14));
        System.out.println(tree.lowerKey(25));
    }
}
