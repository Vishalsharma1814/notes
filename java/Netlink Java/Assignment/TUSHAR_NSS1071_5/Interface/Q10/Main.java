package Interface.Q10;

public class Main implements A,B{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }

    @Override
    public void show() {
        System.out.println("Showing the details");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.greet();
        m.show();
    }
}
