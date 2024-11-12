package MultiThreading.staticScynchronization;

public class MyThread2 extends Thread{

    BookTheatreSeats bookTheatreSeats;
    int seats;

    MyThread2(BookTheatreSeats bookTheatreSeats,int seats){
        this.bookTheatreSeats = bookTheatreSeats;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheatreSeats.bookSeats(seats);
    }
}
