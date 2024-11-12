package MultiThreading.Examples;

public class Test1 {

    public static void main(String[] args) throws InterruptedException{

        MyThreadJoin.mt = Thread.currentThread();
        MyThreadJoin mj = new MyThreadJoin();
        mj.start();

        for (int i = 0; i <= 5; i++) {

            System.out.println("Main Thread..." + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
        }
    }
}
