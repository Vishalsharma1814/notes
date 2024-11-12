package OOPS.Q11;

public class B extends Parent{

    @Override
    void method() {
        System.out.println("This is second subclass.....");
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}
