
import java.util.Scanner;

class CabBooking {

    String name;
    String cabType;
    int distance;
    int fare;

    CabBooking(String name) {

        this.name = name;
        cabType = "Mini";
        distance = 5;
        fare = 75;

    }

    CabBooking(String name, String cabType, int distance) {
        this.name = name;
        this.cabType = cabType;
        this.distance = distance;
        fare = distance * 15;
    }

    void display() {

        System.out.println("Passenger: " + this.name);
        System.out.println("Cab Type: " + this.cabType);
        System.out.println("Distance: " + this.distance + " km");
        System.out.println("Fare: Rs. " + this.fare);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter name: ");
        String name = scan.nextLine();

        if (choice == 1) {

            CabBooking c1 = new CabBooking(name);
            c1.display();

        } else if (choice == 2) {

            System.out.println("Enter cab type: ");

            String cabType = scan.nextLine();
            System.out.println("Enter distance: ");
            int distance = scan.nextInt();
            CabBooking c2 = new CabBooking(name, cabType, distance);
            c2.display();

        }
    }
}
