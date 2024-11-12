package Polymorphism.Q4;

public class Test {

    public static void main(String[] args) {
        Parent p = new Parent();
        p.msg(34,56.98);

        Child c = new Child();
        c.msg(55,78.66);

        Parent pp = new Child();
        pp.msg(67,78.45);
    }
}
