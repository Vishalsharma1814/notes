package Interface.Q9;

public class Interface implements Inf2{
    @Override
    public void k1() {
        System.out.println("K1....");
    }

    @Override
    public void k2() {
        System.out.println("K2....");
    }

    @Override
    public void k3() {
        System.out.println("K3....");
    }

    @Override
    public void k4() {
        System.out.println("K4....");
    }

    public static void main(String[] args) {
        Interface in = new Interface();
        in.k1();
        in.k2();
        in.k3();
        in.k4();
    }
}
