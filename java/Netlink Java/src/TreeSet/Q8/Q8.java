package TreeSet.Q8;

import HashSet.Q10.Q10;
import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class Q8 {

    public static TreeSet<Integer> ss = new TreeSet<>();

    public static TreeSet<String> ss1 = new TreeSet<>();

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
            System.out.println("Comparing two tree sets");
        }
        else{
            System.out.println("Not comparing two tree sets");
        }
    }
}
