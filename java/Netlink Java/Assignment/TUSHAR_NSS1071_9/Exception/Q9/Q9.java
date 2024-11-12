package Exception.Q9;

public class Q9 {

    public static String exception(){
        try{
            return "Try Block Occurs !!";
        }
        catch(StringIndexOutOfBoundsException se){
            System.out.println("String exception occurs !!");
        }
        return "I'm return statement";
    }

    public static void main(String[] args) {

        System.out.println(Q9.exception());
    }
}
