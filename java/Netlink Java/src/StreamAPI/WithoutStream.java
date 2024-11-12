package StreamAPI;

import java.util.ArrayList;
import java.util.Iterator;

public class WithoutStream {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Using for loop.....");
//      Using for loop
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println("Using for each loop......");

//      Using for each loop
        for(Integer i:arrayList){
            System.out.println(i);
        }

        System.out.println("Using iterator.......");
//      Using iterator
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
