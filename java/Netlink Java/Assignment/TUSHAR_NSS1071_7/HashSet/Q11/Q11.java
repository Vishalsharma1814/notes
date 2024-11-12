package HashSet.Q11;

import HashSet.Q10.Q10;

import java.util.HashSet;


public class Q11 {

    public static HashSet<String> stringSet = new HashSet<>();

    public static HashSet<String> strings = new HashSet<>();

    public static void get_data(){
        stringSet.add("Apple");
        stringSet.add("Mango");
        stringSet.add("Guava");
        stringSet.add("Pineapple");
        stringSet.add("Orange");
        stringSet.add("Grapes");

        strings.add("Lamp");
        strings.add("Table");
        strings.add("Chair");
        strings.add("Pen");
        strings.add("Pencil");
        strings.add("Mango");
        strings.add("Orange");


    }

    public static void main(String[] args) {

        Q11.get_data();
       stringSet.retainAll(strings);
        System.out.println(stringSet);
    }
}
