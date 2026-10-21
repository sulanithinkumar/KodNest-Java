
import java.util.Scanner;

class Message {

    String text;

    Message(String text) {

        this.text = text;
    }

    void displayText() {

        System.out.println("Message: " + text);
    }

    static void displayCourse() {

        System.out.println("Course: Java");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String msg = scanner.nextLine();

        Message m = new Message(msg);

        m.displayText();
        m.displayCourse();
    }
}
