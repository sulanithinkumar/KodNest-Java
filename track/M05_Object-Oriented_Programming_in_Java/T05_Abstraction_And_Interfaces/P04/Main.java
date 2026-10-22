
import java.util.Scanner;

interface Printable {

    void print();
}

class Report implements Printable {

    String title;

    Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Printing: " + title);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();

        Printable print = new Report(title);

        print.print();
    }
}
