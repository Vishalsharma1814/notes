package TreeMap.Q4;

import TreeMap.Q3.Q3;

import java.util.TreeMap;

public class Q4 {

    public static TreeMap<String,String> tree = new TreeMap<>();

    public static void get_data(){
        tree.put("A1","B1");
        tree.put("A2","B2");
        tree.put("A3","B3");
        tree.put("A4","B4");
        tree.put("A5","B5");
    }

    public static void main(String[] args) {

        Q4.get_data();
        if(tree.containsValue("B4")){
            System.out.println("B4 value is present");
        }
        else{
            System.out.println("B4 value is not present");
        }
    }
}
