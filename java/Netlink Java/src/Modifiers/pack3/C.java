package Modifiers.pack3;

public class C extends B{

    public void add(){
        System.out.println("Addition");
    }

    public void sub(){
        System.out.println("Subtraction");
    }

    public void mul(){
        System.out.println("Multiplication");
    }

    public void div(){
        System.out.println("Division");
    }

    public static void main(String[] args) {
        C c = new C();
        c.add();
        c.sub();
        c.mul();
        c.div();
    }
}
