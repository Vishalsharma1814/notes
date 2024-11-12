package Polymorphism.Q8;

public class Child extends Parent{

    @Override
    public Integer greet(int b){
        System.out.println("B");
        return b;
    }
}
