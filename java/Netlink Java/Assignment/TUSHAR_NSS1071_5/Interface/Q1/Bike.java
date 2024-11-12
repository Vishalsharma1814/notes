package Interface.Q1;

public class Bike implements Vehicle{

    @Override
    public void run() {
        System.out.println("Bike is Running");
    }

    @Override
    public void speed() {
        System.out.println("Bike speed is 40KM/H");
    }

    public static void main(String[] args) {
        Bike bk = new Bike();
        bk.run();
        bk.speed();
    }
}
