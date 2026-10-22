
import java.util.Scanner;

class Message {

    public void show(String text) {
        System.out.println("Message " + text);
    }
}

class EmailMessage extends Message {

    public void show(String text) {
        System.out.println("Email" + text);
    }
}

class SmsMessage extends Message {

    public void show(String text) {
        System.out.println("SMS" + text);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        String text = scanner.nextLine();

        Message msg;

        if (choice == 1) {
            msg = new EmailMessage();
        } else {
            msg = new SmsMessage();
        }

        msg.show(text);
    }
}
