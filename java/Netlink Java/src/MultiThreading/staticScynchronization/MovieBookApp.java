package MultiThreading.staticScynchronization;

public class MovieBookApp {

    public static void main(String[] args) {
        BookTheatreSeats bookTheatreSeats = new BookTheatreSeats();

        MyThread mt = new MyThread(bookTheatreSeats,10);
        mt.start();

        MyThread2 mt1 = new MyThread2(bookTheatreSeats,5);
        mt1.start();

        BookTheatreSeats bookTheatreSeats1 = new BookTheatreSeats();

        MyThread pt = new MyThread(bookTheatreSeats1,4);
        pt.start();

        MyThread2 pt1 = new MyThread2(bookTheatreSeats1,8);
        pt1.start();
    }
}
