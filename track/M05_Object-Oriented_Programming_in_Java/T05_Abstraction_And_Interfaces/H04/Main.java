
import java.util.Scanner;

interface Notifiable {

    void notifyUser();
}

class EmailAlert implements Notifiable {

    String message;

    EmailAlert(String message) {
        this.message = message;
    }

    @Override
    public void notifyUser() {
        System.out.println("Email alert: " + message);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        Notifiable notify = new EmailAlert(message);

        notify.notifyUser();
    }
}
