package MultiThreading;

public class MyThreadOne extends Thread{

    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Child Thread..."+Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
        }
    }

//    public void start(){
//        System.out.println("Start Method");
//    }
}
