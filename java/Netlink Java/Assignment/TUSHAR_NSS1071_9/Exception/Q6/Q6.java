package Exception.Q6;

public class Q6 {

    public static void main(String[] args) {
        Integer[] i = {45,67,89,23,66,78};
        try{
            System.out.println(12/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception Occurs !!");
        }
        finally{
            try{
                System.out.println(i[12]);
            }
            catch(IndexOutOfBoundsException ie){
                System.out.println("Index Out Of Bound Exception Occurs !!");
            }
        }
    }
}
