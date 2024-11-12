package Java8.ConstructorReference;

public class Q1 {

    public static void main(String[] args) {

        Interf1 it = Hello::new;
        it.display("Tushar");
    }
}
