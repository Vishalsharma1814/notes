package Abstract;

public class FountainPen extends Pen{

    // Defining abstract methods
    public void write(){
        System.out.println("Writing is done by pen");
    }
    public void refill(){
        System.out.println("Refilling the pen");
    }

    // Non-abstract method
    public void Nib(){
        System.out.println("Nib of the pen");
    }
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.Nib();

    }
}
