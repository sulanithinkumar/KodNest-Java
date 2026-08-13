
import java.util.Scanner;

class SupportTicket {

    int id;
    int priority;
    int waitingMinutes;

}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SupportTicket t1 = new SupportTicket();

        System.out.println("Enter Ticket ID: ");
        t1.id = scanner.nextInt();
        System.out.println("Enter Priority: ");
        t1.priority = scanner.nextInt();
        System.out.println("Enter Wainting Minutes: ");
        t1.waitingMinutes = scanner.nextInt();

        SupportTicket t2 = new SupportTicket();

        System.out.println("Enter Ticket ID: ");
        t2.id = scanner.nextInt();
        System.out.println("Enter Priority: ");
        t2.priority = scanner.nextInt();
        System.out.println("Enter Wainting Minutes: ");
        t2.waitingMinutes = scanner.nextInt();

        SupportTicket t3 = new SupportTicket();

        System.out.println("Enter Ticket ID: ");
        t3.id = scanner.nextInt();
        System.out.println("Enter Priority: ");
        t3.priority = scanner.nextInt();
        System.out.println("Enter Wainting Minutes: ");
        t3.waitingMinutes = scanner.nextInt();

        SupportTicket selectedTicket = t1;

        if (t2.priority > selectedTicket.priority) {
            selectedTicket = t2;
        } else if (t2.priority == selectedTicket.priority && t2.waitingMinutes > selectedTicket.waitingMinutes) {
            selectedTicket = t2;
        } else if (t2.priority == selectedTicket.priority && t2.waitingMinutes == selectedTicket.waitingMinutes && t2.id < selectedTicket.id) {
            selectedTicket = t2;;

        }

        if (t3.priority > selectedTicket.priority) {
            selectedTicket = t3;
        } else if (t3.priority == selectedTicket.priority && t3.waitingMinutes > selectedTicket.waitingMinutes) {
            selectedTicket = t3;
        } else if (t3.priority == selectedTicket.priority && t3.waitingMinutes == selectedTicket.waitingMinutes && t3.id < selectedTicket.id) {
            selectedTicket = t3;
        }

        System.out.println("Selected Ticket: " + selectedTicket.id);
        System.out.println("Priority: " + selectedTicket.priority);
        System.out.println("Waiting Minutes: " + selectedTicket.waitingMinutes);

    }
}
