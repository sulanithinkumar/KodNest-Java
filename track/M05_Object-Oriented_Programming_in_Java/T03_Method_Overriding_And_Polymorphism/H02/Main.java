
import java.util.Scanner;

class Notification {

    public void send(String message) {
        System.out.println("Notification " + message);
    }
}

class EmailNotification extends Notification {

    public void send(String message) {
        System.out.println("Email " + message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        EmailNotification email = new EmailNotification();
        email.send(scanner.next());
    }
}
