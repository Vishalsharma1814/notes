package MultiThreading.Examples;

public class MyThread extends Thread{

    public void run(){
        try {
            for (int i = 0; i <= 5; i++) {
                Thread.sleep(1000,10);
                System.out.println("Child Thread..." + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
            }
        }
        catch (InterruptedException ie){
            System.out.println("Interrupted Exception !!");
        }
    }
}
