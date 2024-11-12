package Exception.Q3;

public class Q3 {

    public static void main(String[] args) {
        String[] s = {"Apple","Mango","Banana","Guava","Grapes"};
        try{
            System.out.println("Outer try block");
            System.out.println(78/0);
            try{
                System.out.println("Inner try block");
                System.out.println(s[7]);
            }
            catch(IndexOutOfBoundsException ie){
                System.out.println("Index out of bound exception !!");
            }
            try{
                System.out.println("Inner-Inner try block");
                System.out.println("No exception occurs !!");
            }
            catch(Exception e){
                System.out.println("Exception occurs !!");

            }
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occurs !!");
        }
    }
}

