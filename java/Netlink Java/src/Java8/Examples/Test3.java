package Java8.Examples;

// Normal Approach
//public class Test3 implements Interf3{
//
//    @Override
//    public void square(int i) {
//        System.out.println("Square: "+(i*i));
//    }
//
//    public static void main(String[] args) {
//        Interf3 it3 = new Test3();
//        it3.square(30);
//    }
//}

// Java 8 Approach
public class Test3 {

    public static void main(String[] args) {
        Interf3 it3 = i -> System.out.println("Square: "+(i*i));
        it3.square(40);
    }
}
