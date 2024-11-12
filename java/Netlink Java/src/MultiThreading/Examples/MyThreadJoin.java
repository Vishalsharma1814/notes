package MultiThreading.Examples;

public class MyThreadJoin extends Thread{

    static Thread mt;

    public void run() {
        try {
            mt.join();
            for (int i = 0; i <= 5; i++) {
                System.out.println("Child Thread..." + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
            }
        }
        catch(InterruptedException ie){
            System.out.println("Interrupted Exception !!");
        }
    }

}
