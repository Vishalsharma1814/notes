package Exception.Q2;

import java.sql.SQLException;

public class Q2 {

    public static void main(String[] args) {
        String[] s = {"Yogesh","Hemant","Girish","Pritam"};
        try{
            System.out.println(s[4]);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occurs !!");
        }
        catch(IndexOutOfBoundsException ie){
            System.out.println("Index out of bound exception !!");
        }
        catch(Exception e){
            System.out.println("Exception occurs");
        }
//        catch(SQLException se){
//            System.out.println("SQL Exception occurs !!");
//        }
    }
}
