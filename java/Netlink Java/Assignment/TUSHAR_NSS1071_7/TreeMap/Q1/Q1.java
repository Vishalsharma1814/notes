package TreeMap.Q1;

import java.util.Map;
import java.util.TreeMap;

public class Q1 {

    public static TreeMap<Integer,String> treeMap = new TreeMap<>();

    public static void get_data(){
        treeMap.put(101,"Tushar");
        treeMap.put(102,"Harshit");
        treeMap.put(103,"Hemant");
        treeMap.put(104,"Payal");
        treeMap.put(105,"Naresh");
        treeMap.put(106,"Mahesh");
    }

    public static void main(String[] args) {
        Q1.get_data();
        for(Map.Entry<Integer,String> i:treeMap.entrySet()){
            System.out.println(i);
        }
    }
}
