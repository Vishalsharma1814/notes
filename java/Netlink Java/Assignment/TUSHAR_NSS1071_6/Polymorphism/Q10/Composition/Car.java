package Polymorphism.Q10.Composition;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void move(){
        if(engine!=null){
            System.out.println("Car is moving....");
        }
    }
}
