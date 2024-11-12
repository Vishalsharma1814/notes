package Java8.Function;

import java.util.function.Function;

public class Q3 {

    static String[] x = {"Red","Yellow","Green","Blue","Violet","Pink"};
    public static void main(String[] args) {

        Function<String,Integer> val = a -> a.length();
        System.out.println(val.apply(String.valueOf(x)));

    }
}
