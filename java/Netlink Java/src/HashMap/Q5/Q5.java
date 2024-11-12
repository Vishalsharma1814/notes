package HashMap.Q5;

import java.util.HashMap;

public class Q5 {

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

        Q5.get_data();
        h.clear();
        if(h.isEmpty()){
            System.out.println("Hash Map is empty");
        }
        else{
            System.out.println("Hash Map is not empty");
        }
    }
}
