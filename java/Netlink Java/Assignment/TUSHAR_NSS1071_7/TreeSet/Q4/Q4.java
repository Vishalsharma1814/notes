package TreeSet.Q4;

import java.util.Iterator;
import java.util.TreeSet;

public class Q4 {

    public static TreeSet<String> colors = new TreeSet<>();

    public static void get_data(){
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("White");
        colors.add("Grey");
        colors.add("Brown");
    }

    public static void main(String[] args) {

        Q4.get_data();
        Iterator iterator = colors.descendingIterator();
        System.out.println("Elements in reverse order: ");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
