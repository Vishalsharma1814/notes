package OOPS.Q5;

public class Triangle {

    public int Area(int height,int base){
        return (height*base)/2;
    }

    public int Perimeter(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Area of triangle: "+t.Area(12,34));
        System.out.println("Perimeter of triangle: "+t.Perimeter(3,8,4));
    }
}
