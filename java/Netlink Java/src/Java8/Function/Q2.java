package Java8.Function;

import java.util.function.Function;

public class Q2 {

    public static void main(String[] args) {

        Function<String,Integer> len = s -> s.length();
        System.out.println(len.apply("Pineapple"));

        Function<String,String> lower = x -> x.toLowerCase();
        System.out.println(lower.apply("MOONLIGHT"));
    }
}
