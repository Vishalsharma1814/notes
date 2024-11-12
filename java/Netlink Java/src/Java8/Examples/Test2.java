package Java8.Examples;

// Normal Approach
//public class Test2 implements Interf2{
//
//    @Override
//    public void sum(int a, int b) {
//        System.out.println("Sum: "+(a+b));
//    }
//
//    public static void main(String[] args) {
//        Interf2 it2 = new Test2();
//        it2.sum(45,67);
//    }
//}

// Java 8 Approach

public class Test2 {

    public static void main(String[] args) {
        Interf2 it2 = (int a,int b) -> System.out.println("Sum: "+(a+b));
        it2.sum(44,78);
    }
}