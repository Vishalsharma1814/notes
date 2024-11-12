package Collections.Q5;

import java.util.LinkedList;

public class Q5 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Table");
        ll.add(1,"Chair");
        ll.addFirst("Notebook");
        ll.addLast("Lamp");

        System.out.println(ll.get(2));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
    }
}
