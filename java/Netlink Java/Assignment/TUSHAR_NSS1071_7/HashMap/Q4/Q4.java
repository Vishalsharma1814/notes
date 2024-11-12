package HashMap.Q4;

import HashMap.Q3.Q3;

import java.util.HashMap;

public class Q4 {

    public static HashMap<Integer,String> h = new HashMap<>();

    public static void get_data(){
        h.put(1,"Apple");
        h.put(2,"Mango");
        h.put(3,"Orange");
        h.put(4,"Grapes");
        h.put(5,"Pineapple");
        h.put(6,"Watermelon");

    }

    public static void main(String[] args) {
        Q4.get_data();
        System.out.println("Hash Map before removing all elements: ");
        System.out.println(h);
        System.out.println("Hash map after removing all elements: ");
        h.clear();
        System.out.println(h);

    }
}
