package Exception.Q7;

public class Q7 {

    public static void main(String[] args) {
        String[] s = {"Lamp","Table","Chair","Notebook","Pen"};
        try{
            System.out.println(66/0);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception Occurs !!");
        }
        finally{
            try{
                s[6] = "Pencil";
            }
//            catch(InterruptedException in){ // Checked Exception
//                System.out.println("Interrupted Exception Occurs !!");
//            }
            catch(NullPointerException ne){ // Unchecked Exception
                System.out.println("Null Pointer Exception Occurs !!");
            }
            catch(IndexOutOfBoundsException ie){ // Unchecked Exception
                System.out.println("Index Out Of Bound Exception Occurs !!");
            }


        }
    }
}
