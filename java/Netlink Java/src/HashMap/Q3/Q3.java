package HashMap.Q3;

import java.util.HashMap;

public class Q3 {

    public static HashMap<Integer,String> h = new HashMap<>();
    public static HashMap<Integer,String> hh = new HashMap<>();

    public static void get_data(){
        h.put(1,"Apple");
        h.put(2,"Mango");
        h.put(3,"Orange");
        h.put(4,"Grapes");
        h.put(5,"Pineapple");
        h.put(6,"Watermelon");

        hh.put(101,"Tushar");
        hh.put(102,"Hemant");
        hh.put(103,"Kahish");
        hh.put(104,"Harshit");
        hh.put(105,"Prakash");
        hh.put(106,"Lalit");
    }

    public static void main(String[] args) {
        Q3.get_data();
        h.putAll(hh);
        System.out.println(h);

    }

}
