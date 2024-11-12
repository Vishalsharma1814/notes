package Java8.FunctionalInterface;

@FunctionalInterface
public interface Demo {

    public abstract void m1();
    // Case 1
//    public abstract void m4(); // Functional Interface -> CE

    default void m2(){
        System.out.println("Hi....");
    }

    static void m3(){
        System.out.println("Bye.....");
    }
}
