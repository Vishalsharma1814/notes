package Interface.Q1;

public class Bicycle implements Vehicle {

    @Override
    public void run() {
        System.out.println("Bicycle is Running");
    }

    @Override
    public void speed() {
        System.out.println("Bicycle peed is 10KM/H");
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.run();
        b.speed();
    }

}