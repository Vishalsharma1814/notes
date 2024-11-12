package Java8.Supplier;

import java.util.function.Supplier;

public class Q3 {

    public static void main(String[] args) {

        Supplier<String> name = () -> "Tushar";
        System.out.println(name.get());
    }
}
