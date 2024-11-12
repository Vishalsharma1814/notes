package Interface.Q1;

public class Car implements Vehicle{

    @Override
    public void run() {
        System.out.println("Car is Running");
    }

    @Override
    public void speed() {
        System.out.println("Car peed is 60KM/H");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
        c.speed();
    }


}
