package HashMap.Q11;

import java.util.HashMap;

public class Q11 {
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
        Q11.get_data();
        System.out.println(h.keySet());

    }

}
