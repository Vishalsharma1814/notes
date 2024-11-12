package Interface.Q8;

public class Circle {

    public void Circle(int r){
        System.out.println("Area of circle: "+(3.14*r*r));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.Circle(34);
    }
}
