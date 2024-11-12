package Java8.Consumer;

import java.util.function.Consumer;

public class Q1 {

    public static void main(String[] args) {
        Consumer<String> name = s -> System.out.println(s);
        name.accept("Tushar");
        name.accept("Harshit");
    }
}
