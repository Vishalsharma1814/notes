package Collections.Q4;

import java.util.LinkedList;

public class Q4 {

    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Table");
        ll.add(1,"Chair");
        ll.addFirst("Notebook");
        ll.addLast("Lamp");

        System.out.println(ll);

        LinkedList ll1 = new LinkedList();
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);

        ll.addAll(ll1);
        System.out.println(ll);

        ll.remove("Lamp");
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
