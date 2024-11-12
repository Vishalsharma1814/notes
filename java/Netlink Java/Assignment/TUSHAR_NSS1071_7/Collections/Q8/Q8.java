package Collections.Q8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q8 {

    public static void main(String[] args) {


        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Table");
        ll.add(1,"Chair");
        ll.add("Notebook");
        ll.add("Lamp");
        ll.add("Pen");
        ll.add("Pencil");


        // 1. Iterator
        System.out.println("Iterator......");
        Iterator<String> it = ll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------");

        // 2. List Iterator
        System.out.println("List Iterator.....");
        ListIterator li = ll.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("---------------");

        // 3. For Loop
        System.out.println("For Loop.....");
        for(int i=0;i<ll.size();i++)
        {
            System.out.println(ll.get(i));

        }

        System.out.println("---------------");

        // 4. For Each Loop
        System.out.println("For Each Loop......");
        for(String e:ll){
            System.out.println(e);
        }

    }
}
