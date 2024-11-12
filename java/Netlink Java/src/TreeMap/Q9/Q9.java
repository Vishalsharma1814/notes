package TreeMap.Q9;

import java.util.TreeMap;

public class Q9 {
    public static TreeMap<String,String> tree = new TreeMap<>();

    public static void get_data(){
        tree.put("A1","B1");
        tree.put("A2","B2");
        tree.put("A3","B3");
        tree.put("A4","B4");
        tree.put("A5","B5");
    }

    public static void main(String[] args) {

        Q9.get_data();
        System.out.println(tree.descendingKeySet());
    }
}
