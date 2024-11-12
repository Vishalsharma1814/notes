package MultiThreading;

public class MyThreadTwo implements Runnable{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Child Thread..."+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }
}
