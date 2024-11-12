package Modifiers.pack1;

public class FinalVar {

    final int a = 30; // Final instance variable
    final static int b = 90; // Final static variable

    public static void main(String[] args) {
        FinalVar v = new FinalVar();
        System.out.println("Original value of a (instance) = "+v.a);
        // Changing value of a
         // v.a = 89; // Final instance variable can't be reinitialized
        System.out.println("Original value of b (static) = "+b);
        // FinalVar.b = 88; // Final static variable can't be reinitialized

    }
}
