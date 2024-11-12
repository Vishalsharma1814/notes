package Exception.Q12;

public class Q12 {

    public static void main(String[] args) {
        try{
            System.out.println("Try Block Occurs !!");
            System.exit(0);
        }
        catch(Exception e){
            System.out.println("Exception Occurs !!");
        }
        finally{
            System.out.println("Finally Block Occurs !!");
        }
    }
}
