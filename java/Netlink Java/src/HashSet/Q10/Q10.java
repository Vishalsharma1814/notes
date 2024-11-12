package HashSet.Q10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q10 {

    public static Set<Integer> ss = new HashSet<>();

    public static Set<String> ss1 = new HashSet<>();

    public static void get_data(){
        ss.add(12);
        ss.add(98);
        ss.add(10);
        ss.add(66);
        ss.add(55);
        ss.add(33);

        ss1.add("Lamp");
        ss1.add("Table");
        ss1.add("Chair");
        ss1.add("Pen");
        ss1.add("Pencil");
    }

    public static void main(String[] args) {

        Q10.get_data();
        if(ss.contains(ss1)){
            System.out.println("Comparing two hash sets");
        }
        else{
            System.out.println("Not comparing two hash sets");
        }
    }
}
