package Interface.Q2;

public class D implements C{


    @Override
    public void a1() {
        System.out.println("Interface A");
    }

    @Override
    public void b1() {
        System.out.println("Interface B");
    }

    @Override
    public void c1() {
        System.out.println("Interface C");
    }

    public static void main(String[] args) {
        D dd = new D();
        dd.a1();
        dd.b1();
        dd.c1();
    }
}
