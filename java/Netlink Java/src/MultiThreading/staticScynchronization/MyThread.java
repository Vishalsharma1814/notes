package MultiThreading.staticScynchronization;

public class MyThread extends Thread{

    BookTheatreSeats bookTheatreSeats;
    int seats;

    MyThread(BookTheatreSeats bookTheatreSeats,int seats){
        this.bookTheatreSeats = bookTheatreSeats;
        this.seats = seats;
    }

    @Override
    public void run() {
        bookTheatreSeats.bookSeats(seats);
    }
}
