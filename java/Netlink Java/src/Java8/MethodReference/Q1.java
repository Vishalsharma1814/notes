package Java8.MethodReference;

public class Q1{

    public void example(){
        System.out.println("Instance Method !!");
    }

    public static void main(String[] args) {

        Q1 obj = new Q1();
        Interf1 it = obj::example;
        it.example();
    }
}
