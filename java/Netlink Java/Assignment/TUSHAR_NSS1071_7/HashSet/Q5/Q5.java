package HashSet.Q5;

import java.util.HashSet;
import java.util.Set;

public class Q5 {

    public static Set<String> strings = new HashSet<>();

    public static void get_date(){
        strings.add("Sky");
        strings.add("Moon");
        strings.add("Sun");
        strings.add("Earth");
        strings.add("Mercury");
    }

    public static void main(String[] args) {
        Q5.get_date();
        strings.removeAll(strings);
        if(strings.isEmpty()){
            System.out.println("Hash set is empty");
        }
        else{
            System.out.println("Hash set is not empty");
        }
    }
}
