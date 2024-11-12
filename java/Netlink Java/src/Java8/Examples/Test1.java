package Java8.Examples;

// Normal Approach
//public class Test1 implements Interf1{
//
//    public void m1(){
//        System.out.println("Hi....");
//    }
//
//    public static void main(String[] args) {
//        Test1 t1 = new Test1();
//        t1.m1();
//        System.out.println("-----------------------");
//        Interf1 it1 = new Test1();
//        it1.m1();
//    }
//}

// Java 8 Approach

public class Test1 {

    public static void main(String[] args) {
        Interf1 it1 = () -> System.out.println("Hi.....");
        it1.m1();
    }
}
