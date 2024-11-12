package Java8.Supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class Q1 {


    public static void main(String[] args) {

        Supplier<LocalDateTime> supplier = ()->LocalDateTime.now();
        System.out.println(supplier.get());
    }
}
