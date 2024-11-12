package Java8.Predicate;

import java.util.function.Predicate;

public class Q3 {

    static String a = "Delhi,Mumbai,Lucknow,Bhopal,Sikkim";
    public static void main(String[] args) {

        Predicate<String> cont = x -> x.contains("Lucknow");
        System.out.println(cont.test(a));

        Predicate<String> comp = y -> y.equals("Sikkim");
        System.out.println(comp.test(a));


    }
}
