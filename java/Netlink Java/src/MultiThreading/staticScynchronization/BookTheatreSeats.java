package MultiThreading.staticScynchronization;

public class BookTheatreSeats {

    static int total_sets = 20;

    public static synchronized void bookSeats(int seats){

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