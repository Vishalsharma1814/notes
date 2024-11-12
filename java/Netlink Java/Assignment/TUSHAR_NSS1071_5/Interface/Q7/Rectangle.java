package Interface.Q7;

public class Rectangle {
Rectangle(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
}
    private int length;
    private int breadth;

    public static void main(String[] args) {
        Rectangle r = new Rectangle(12, 14);
        System.out.println(r.length);
        System.out.println(r.breadth);
    }

}
