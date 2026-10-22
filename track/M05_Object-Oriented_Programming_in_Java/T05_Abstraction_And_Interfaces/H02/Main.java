
import java.util.Scanner;

abstract class Message {

    abstract void send();
}

class SMS extends Message {

    String num;

    SMS(String num) {
        this.num = num;
    }

    void send() {
        System.out.println("SMS sent to " + num);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        Message msg = new SMS(number);

        msg.send();
    }
}
