
import java.util.Scanner;

abstract class Document {

    String title;

    Document(String title) {
        this.title = title;
    }

    abstract void showType();
}

interface Printable {

    void print();
}

class Report extends Document implements Printable {

    Report(String title) {
        super(title);
    }

    void showType() {
        System.out.println("Report: " + title);
    }

    public void print() {
        System.out.println("Printed: " + title);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.next();

        Report report = new Report(title);

        report.showType();
        report.print();
    }
}
