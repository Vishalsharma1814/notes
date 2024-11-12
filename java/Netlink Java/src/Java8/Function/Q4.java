package Java8.Function;

import java.util.function.Function;

public class Q4 {

    public static void main(String[] args) {

        Function<String, Integer> func = x -> x.length();

        Function<Integer, Integer> func2 = x -> x * 4;

        System.out.println(func.andThen(func2).apply("Watermelon"));
    }
}
