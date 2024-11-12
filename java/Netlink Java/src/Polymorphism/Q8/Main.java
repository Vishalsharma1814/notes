package Polymorphism.Q8;

public class Main {

    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p.greet(56));

        Child c = new Child();
        System.out.println(c.greet(90));

        Parent pp = new Child();
        System.out.println(pp.greet(55));



    }

}
