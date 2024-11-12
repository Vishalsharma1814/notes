package Java8.Consumer;

import java.util.function.Consumer;

public class Q2 {

    static String[] s = {"Apple","Mango","Pineapple","Watermelon","Grapes"};
    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept(s[3]);
    }
}
