package Collections.Q7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q7 {

    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Table");
        ll.add(1,"Chair");
        ll.add("Notebook");
        ll.add("Lamp");
        ll.add("Pen");
        ll.add("Pencil");

        System.out.println("List Iterator.....");
        ListIterator li = ll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }





    }
}
