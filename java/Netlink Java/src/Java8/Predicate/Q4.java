package Java8.Predicate;

import java.util.function.Predicate;

public class Q4 {

    static String s = "Cryptography is the study of secure communications techniques " +
            "that allow only the sender and intended recipient of a message to " +
            "view its contents.";

    public static void main(String[] args) {

        Predicate<String> check = a -> a.contains("Message");
        System.out.println(check.test(s));
        Predicate<String> check1 = b -> b.contains("sender");
        System.out.println(check1.test(s));

    }
}
