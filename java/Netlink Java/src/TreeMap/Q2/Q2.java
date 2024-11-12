package TreeMap.Q2;

import java.util.TreeMap;

public class Q2 {

    public static TreeMap<String,String> tree = new TreeMap<>();
    public static TreeMap<String,String> tree_1 = new TreeMap<>();

    public static void get_data(){
        tree.put("A1","B1");
        tree.put("A2","B2");
        tree.put("A3","B3");
        tree.put("A4","B4");
        tree.put("A5","B5");

        tree_1.put("C1","D1");
        tree_1.put("C2","D2");
        tree_1.put("C3","D3");
        tree_1.put("C4","D4");
        tree_1.put("C5","D5");
    }

    public static void main(String[] args) {

        Q2.get_data();
        tree.putAll(tree_1);
        System.out.println(tree);
    }
}
