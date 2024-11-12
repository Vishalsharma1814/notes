package StreamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class WithStream {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Using for loop.....");
//      Using for loop
        for(int i=1;i<=10;i++){
            arrayList.add(i);
        }
        System.out.println(arrayList);

        System.out.println("Example 1.....");

        List<Integer> lt = arrayList.stream().filter(i->i>10).map(i->i*i).collect(Collectors.toList());
        lt.stream().forEach(System.out::println);

        System.out.println("Example 2.....");

        List<Integer> collect = arrayList.stream().map(i->i*i).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);

        System.out.println("Example 3.....");

        arrayList.stream().sorted().forEach(System.out::println);

        System.out.println("Example 4......");
        arrayList.stream().sorted(((o1, o2) -> o1.compareTo(o2))).forEach(System.out::println);

        System.out.println("Example 5......");
        Integer ig = arrayList.stream().max(((o1, o2) -> o1.compareTo(o2))).get();
        System.out.println(ig);

        System.out.println("Example 6......");
        Integer igg = arrayList.stream().min(((o1, o2) -> o1.compareTo(o2))).get();
        System.out.println(igg);



    }
}
