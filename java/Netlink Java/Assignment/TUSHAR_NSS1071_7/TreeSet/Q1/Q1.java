package TreeSet.Q1;

import java.util.Set;
import java.util.TreeSet;

public class Q1 {

    public static Set<String> colors = new TreeSet<>();

    public static void get_data(){
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Purple");
        colors.add("Pink");
        colors.add("White");
        colors.add("Grey");
        colors.add("Brown");
        colors.add("Red");
    }

    public static void main(String[] args) {

        Q1.get_data();
        System.out.println("Colors TreeSet: ");
        System.out.println(colors);
    }
}
