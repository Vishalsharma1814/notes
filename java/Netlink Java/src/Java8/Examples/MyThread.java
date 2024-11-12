package Java8.Examples;

public class MyThread{
//    @Override
//    public void run() {
//        for(int i=0;i<=5;i++){
//            System.out.println(i);
//        }
//    }

    public static void main(String[] args) {

        Runnable rth = () -> {
            for(int i=0;i<=10;i++){
                System.out.println(i);
            }
        };
        Thread th1 = new Thread(rth);
        th1.start();

    }
}
