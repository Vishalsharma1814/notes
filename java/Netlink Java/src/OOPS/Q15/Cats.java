package OOPS.Q15;

public class Cats extends Animal{

    @Override
    void cats() {
        System.out.println("Cats meow");
    }

    @Override
    void dogs() {

    }

    public static void main(String[] args) {
        Cats c = new Cats();
        c.cats();
    }

}
