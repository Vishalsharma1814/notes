package HashSet.Q1;

import java.util.HashSet;
import java.util.Set;

public class Q1 {

    public static Set<String> hash = new HashSet<>();

    public static void hash_get(){
        hash.add("Apple");
        hash.add("Mango");
        hash.add("Orange");
        hash.add("PineApple");
        hash.add(null);
    }

    public static void main(String[] args) {
        Q1.hash_get();
        System.out.println(hash);
    }
}
