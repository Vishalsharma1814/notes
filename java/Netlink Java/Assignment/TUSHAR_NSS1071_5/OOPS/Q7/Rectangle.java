package OOPS.Q7;

public class Rectangle {

    int length;
    int breadth;

    Rectangle(int l,int b){
        this.length = l;
        this.breadth = b;
    }

    public int Area(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        System.out.println("Area of first rectangle: "+r.Area());
        Rectangle rr = new Rectangle(5,8);
        System.out.println("Area of second rectangle: "+rr.Area());
    }
}
