package MultiThreading;

public class Test1 {

    public static void main(String[] args) {
        MyThreadOne mt = new MyThreadOne();
        mt.start();



            for (int i = 0; i <= 10; i++) {
                System.out.println("Main Thread..." + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
            }
    }
}