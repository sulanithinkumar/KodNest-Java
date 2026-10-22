
import java.util.Scanner;

class Report {

    public void display(String title) {
        System.out.println("Report " + title);
    }
}

class StudentReport extends Report {

    public void display(String title) {
        System.out.println("Student " + title);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.next();
        Report report = new StudentReport();
        report.display(title);
    }
}
