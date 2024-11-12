package HashMap.Q1;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Q1 {

    static HashMap<Integer,String> hashMap = new HashMap<>();

    public static void get_data(){
        hashMap.put(1,"Apple");
        hashMap.put(2,"Mango");
        hashMap.put(3,"Orange");
        hashMap.put(4,"Grapes");
        hashMap.put(5,"Pineapple");
        hashMap.put(6,"Watermelon");
    }

    public static void main(String[] args) {

        Q1.get_data();
        for(Map.Entry<Integer,String> i: hashMap.entrySet()){
            System.out.println(i);
        }
    }
}
