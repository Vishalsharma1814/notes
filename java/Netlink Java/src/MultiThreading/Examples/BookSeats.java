package MultiThreading.Examples;

public class BookSeats {

    int total_sets = 10;

    public void bookSeats(int seats) {

        System.out.println("-------------------------------");

        synchronized (this) {
            if (total_sets >= seats) {
                System.out.println("Successfully Booked...." + seats);
                total_sets = total_sets - seats;
                System.out.println("Seats Left...." + total_sets);
            } else {
                System.out.println("Seats can't book.....");
                System.out.println("Seats Left....." + total_sets);
            }
        }
    }
}

