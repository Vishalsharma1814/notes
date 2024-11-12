package OOPS.Q2;


public class Area {

    private int length;
    private int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Area ar = new Area();
        ar.setDim(23,56);
        System.out.println("Area of rectangle : "+ar.getArea());
    }
}
