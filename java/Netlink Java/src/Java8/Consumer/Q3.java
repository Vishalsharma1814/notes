package Java8.Consumer;

import java.util.function.Consumer;

public class Q3 {

    public static void main(String[] args) {
        Consumer<Integer> value = a -> System.out.println(a);
        value.accept(3452);

    }
}
