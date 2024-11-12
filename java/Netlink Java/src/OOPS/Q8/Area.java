package OOPS.Q8;

public class Area {

    int l;
    int b;

    Area(int l,int b){
        this.l = l;
        this.b = b;
    }

    public int returnArea(){
        return l*b;
    }

    public static void main(String[] args) {
        Area ar = new Area(3,6);
        System.out.println("Area of rectangle: "+ar.returnArea());
    }
}
