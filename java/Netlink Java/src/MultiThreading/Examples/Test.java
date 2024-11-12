package MultiThreading.Examples;

public class Test {

    public static void main(String[] args) {

        MyThread mt = new MyThread();
        mt.start();

        try{
            for(int i=0;i<=5;i++){
                Thread.sleep(1000);
                System.out.println("Main Thread..." + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
            }
        }
        catch(InterruptedException ie){
            System.out.println("Interrupted Exeception");
        }

    }
}
