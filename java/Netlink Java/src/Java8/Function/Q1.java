package Java8.Function;

import java.util.function.Function;

public class Q1 {

    public static void main(String[] args) {

        Function<Integer,Integer> cube = i -> i*i*i;
        System.out.println(cube.apply(23));
        System.out.println(cube.apply(11));
    }
}
