package OOPS.Q15;

public class Dogs extends Animal{
    @Override
    void cats() {

    }

    @Override
    void dogs() {
        System.out.println("Dogs bark");
    }

    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.dogs();
    }
}

