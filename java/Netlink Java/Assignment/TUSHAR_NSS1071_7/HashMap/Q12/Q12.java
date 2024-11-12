package HashMap.Q12;

import java.util.HashMap;

public class Q12 {

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
        Q12.get_data();
        System.out.println(h.values());
    }

}
