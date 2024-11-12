package Interface.Q8;

public class Rectangle {

    public void Rectangle(int l,int b){
        System.out.println("Area of rectangle : "+(l*b));
    }

    public static void main(String[] args) {
        Rectangle ra = new Rectangle();
        ra.Rectangle(12,34);
    }
}
