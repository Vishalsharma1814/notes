package HashSet.Q6;

import java.util.HashSet;

public class Q6 {

    public static HashSet<String> hash = new HashSet<>();


    public static void get_data(){
        hash.add("Acer");
        hash.add("Dell");
        hash.add("Lenovo");
        hash.add("Asus");
        hash.add("HP");
    }

    public static void main(String[] args) {
        Q6.get_data();
        HashSet<String> new_hash = (HashSet<String>) hash.clone();
        System.out.println("Clone Hash Set: ");
        System.out.println(new_hash);
    }
}
