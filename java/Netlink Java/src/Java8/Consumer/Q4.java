package Java8.Consumer;


import java.util.function.Consumer;

public class Q4 {

    static Integer[] integers = {45,67,23,66,89,12};
    public static void main(String[] args) {

        Consumer<Integer> value = i -> System.out.println(i);
        value.accept(23);
        Consumer<Integer> value1 = j -> System.out.println(j);
        value1.accept(45);
        value.andThen(value1);

    }

}
