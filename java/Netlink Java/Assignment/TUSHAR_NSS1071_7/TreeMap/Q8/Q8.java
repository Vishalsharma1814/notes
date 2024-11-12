package TreeMap.Q8;

import java.util.TreeMap;

public class Q8 {

    public static TreeMap<String,String> tree = new TreeMap<>();

    public static void get_data(){
        tree.put("A1","B1");
        tree.put("A2","B2");
        tree.put("A3","B3");
        tree.put("A4","B4");
        tree.put("A5","B5");
    }

    public static void main(String[] args) {

        Q8.get_data();
        System.out.println("Greatest Key: "+tree.firstKey());
        System.out.println("Least Key: "+tree.lastKey());
    }
}
