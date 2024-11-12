package Java8.Supplier;

import java.util.function.Supplier;

public class Q4 {
    public static void main(String[] args) {

        Supplier<Integer> num = () -> 45;
        System.out.println(num.get());

    }
}
