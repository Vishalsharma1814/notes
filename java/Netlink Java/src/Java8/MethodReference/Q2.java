package Java8.MethodReference;

public class Q2 {

    public static void example(){
        for(int i=0;i<=5;i++){
            System.out.println("Child Thread"+Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Runnable rth = Q2::example;
        Thread th = new Thread(rth);
        th.start();
    }
}
