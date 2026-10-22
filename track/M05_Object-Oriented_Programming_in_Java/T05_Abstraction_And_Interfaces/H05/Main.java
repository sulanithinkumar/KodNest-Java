
import java.util.Scanner;

interface Printable {

    void print();
}

class Ticket implements Printable {

    String code;

    Ticket(String code) {
        this.code = code;
    }

    public void print() {
        System.out.println("Ticket: " + code);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.next();

        Printable print = new Ticket(code);

        print.print();
    }
}
