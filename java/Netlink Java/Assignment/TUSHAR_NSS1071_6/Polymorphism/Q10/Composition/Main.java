package Polymorphism.Q10.Composition;

public class Main {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Car car = new Car(engine);
        engine.work();
        car.move();

    }


}
