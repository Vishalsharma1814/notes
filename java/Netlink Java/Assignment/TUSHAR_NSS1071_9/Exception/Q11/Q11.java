package Exception.Q11;

public class Q11 {

    public static String exception(){
        String[] s = {"Apple","Mango","Pineapple","Orange","Grapes"};
        try{
            System.out.println(s[6]);
            return "Try Block Occurs !!";
        }
        catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("Array Index Out Of Bound !!");
        }
        return "I'm return statement";
    }

    public static void main(String[] args) {

        System.out.println(Q11.exception());
    }
}
