package MultiThreading.Examples;

public class MovieApp extends Thread{

    static BookSeats bs;
    int seats;

    @Override
    public void run() {
        bs.bookSeats(seats);
    }

    public static void main(String[] args) {
        bs = new BookSeats();
        MovieApp mp = new MovieApp();
        mp.seats = 7;
        mp.start();

        MovieApp mp1 = new MovieApp();
        mp1.seats = 3;
        mp1.start();


        MovieApp mp2 = new MovieApp();
        mp2.seats = 5;
        mp2.start();


    }
}
