package Java8.Predicate;

import java.util.function.Predicate;

public class Q1 {

    public static void main(String[] args) {

        Predicate<Integer> check = i -> i < 12;
        System.out.println(check.test(45));
        System.out.println(check.test(10));


    }
}
