package Java8.MethodReference;

public class Q3 {

    public void m2(int i){
        System.out.println("Method reference...."+i);
    }


    public static void main(String[] args) {
        Q3 obj = new Q3();
        Interf3 it3 = obj::m2;
        it3.m1(200);
    }
}
