package OOPS.Q14;

public class A extends Abstract{
    @Override
    void a_method() {
        System.out.println("This is abstract method");
    }

    public static void main(String[] args) {
        A a = new A();
        a.a_method();
        a.non_abstract();
    }
}
