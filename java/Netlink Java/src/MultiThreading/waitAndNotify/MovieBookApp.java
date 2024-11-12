package MultiThreading.waitAndNotify;

public class MovieBookApp {

    public static void main(String[] args) throws InterruptedException{

        TotalEarning totalEarning = new TotalEarning();
        totalEarning.start();

        totalEarning.join();
            System.out.println("Total Earning: "+"Rs. "+totalEarning.total);


        System.out.println(Thread.currentThread().getName());

    }
}
