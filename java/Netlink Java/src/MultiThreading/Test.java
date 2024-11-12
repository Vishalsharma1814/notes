package MultiThreading;

public class Test {

    public static void main(String[] args) {

        MyThreadTwo mt = new MyThreadTwo();
        Thread t1 = new Thread();
        Thread t2 = new Thread(mt);

        t2.run();

        for(int i=0;i<=10;i++){
            System.out.println("Main Thread..."+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }
}
