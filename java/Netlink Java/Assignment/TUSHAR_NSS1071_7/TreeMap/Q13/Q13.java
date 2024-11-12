package TreeMap.Q13;

import java.util.TreeMap;

public class Q13 {
    public static TreeMap<Integer,String> tree = new TreeMap<>();

    public static void get_data(){
        tree.put(10,"B1");
        tree.put(11,"B2");
        tree.put(15,"B3");
        tree.put(13,"B4");
        tree.put(20,"B5");
    }

    public static void main(String[] args) {
        Q13.get_data();
        System.out.println(tree.headMap(14,true));
        System.out.println(tree.headMap(15,true));
    }
}
