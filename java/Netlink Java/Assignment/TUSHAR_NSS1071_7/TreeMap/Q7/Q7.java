package TreeMap.Q7;

import java.util.Map;
import java.util.TreeMap;

public class Q7 {

    public static TreeMap<Integer,Integer> tree = new TreeMap<Integer,Integer>();

    public static void get_data(){
        tree.put(10,101);
        tree.put(15,102);
        tree.put(12,103);
        tree.put(14,104);
        tree.put(13,105);
    }

    public static void main(String[] args) {
        Q7.get_data();
        System.out.println(tree);

    }

}
