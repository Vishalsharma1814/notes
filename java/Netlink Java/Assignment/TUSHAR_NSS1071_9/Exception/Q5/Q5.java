package Exception.Q5;

public class Q5 {

    public static void main(String[] args) {
        Integer[] i = {23,56,78,12,98,34};
        try{
            System.out.println(i[10]);
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println("Index Out Of Bound Exception Ocurs !!");
            try{
                System.out.println(667/0);
            }
            catch(ArithmeticException ae){
                System.out.println("Arithmetic Exception Occurs !!");
            }
        }
    }
}
