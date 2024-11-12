package Collections.Q2;

import java.util.ArrayList;
import java.util.List;

public class Q2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);

        List list2 = new ArrayList();
        list2.add("Apple");
        list2.add("Mango");
        list2.add("Guava");
        list2.add("Orange");
        list2.add("Pineapple");

        list1.addAll(2,list2);
        System.out.println(list1);

    }
}
