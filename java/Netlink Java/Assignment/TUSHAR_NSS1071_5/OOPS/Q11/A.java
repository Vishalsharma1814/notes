package OOPS.Q11;

public class A extends Parent{
    @Override
    void method() {
        System.out.println("This is first subclass.....");
    }

    public static void main(String[] args) {
        A a = new A();
        a.method();
    }
}
