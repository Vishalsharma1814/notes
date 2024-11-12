package Java8.MethodReference;

import java.util.Arrays;
import java.util.Comparator;

public class Q4 {

    public static void main(String[] args) {

        String[] s = {"Red","Orange","Yellow","Violet","Blue"};

//        Arrays.sort(s, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });

        Arrays.sort(s,String::compareToIgnoreCase);

        for(String ss:s){
            System.out.println(ss);
        }
    }
}
