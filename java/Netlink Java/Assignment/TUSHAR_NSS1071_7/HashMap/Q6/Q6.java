package HashMap.Q6;

import java.util.HashMap;

public class Q6 {


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

        Q6.get_data();
        HashMap<Integer,String> hh = new HashMap<>();
        hh = (HashMap<Integer, String>) h.clone();
        System.out.println("Shallow Copy: ");
        System.out.println(hh);
    }
}
