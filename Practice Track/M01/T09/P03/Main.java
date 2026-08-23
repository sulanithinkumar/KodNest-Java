
import java.util.Scanner;

class TheatreBooking {

    int seats[];
    int bookingCount;

    TheatreBooking(int totalSeats) {
        seats = new int[totalSeats];
    }

    String bookSeat(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            return "Invalid Seat";
        } else if (seats[seatNumber - 1] == 1) {
            return "Already Booked";
        } else {
            seats[seatNumber - 1] = 1;
            bookingCount += 1;
            return "Booked";
        }
    }

    int getAvailableCount() {
        int availableCount = seats.length - bookingCount;
        return availableCount;

    }

    void displaySeatStatus() {
        System.out.println("Seat Status");
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                System.out.println("Seat " + (i + 1) + ": Available");
            } else {
                System.out.println("Seat " + (i + 1) + ": Booked");
            }
        }

        System.out.println("Booked Seats: " + bookingCount);
        System.out.println("Available Seats: " + getAvailableCount());

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter total seats: ");
        int totalSeats = scanner.nextInt();
        System.out.println("Enter number of booking requests: ");
        int noOfRequests = scanner.nextInt();

        TheatreBooking booking = new TheatreBooking(totalSeats);

        for (int i = 0; i < noOfRequests; i++) {
            System.out.println("Enter Seat number: ");
            int seatNumber = scanner.nextInt();
            String result = booking.bookSeat(seatNumber);
            System.out.println("Request " + (i + 1) + " - Seat " + seatNumber + ": " + result);
        }

        booking.displaySeatStatus();
    }

}
