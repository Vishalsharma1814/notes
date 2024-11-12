package OOPS.Q16;

public class Area extends Shape{
    @Override
    int RectangleArea(int length, int breadth) {
        return length*breadth;
    }

    @Override
    int SquareArea(int a) {
        return a*a;
    }

    @Override
    float CircleArea(float r) {
        return (float) (3.14*(r*r));
    }

    public static void main(String[] args) {
        Area arr = new Area();
        System.out.println("Area of rectangle: "+arr.RectangleArea(34,56));
        System.out.println("Area of square: "+arr.SquareArea(45));
        System.out.println("Area of circle: "+arr.CircleArea((float) 67.86));
    }


}