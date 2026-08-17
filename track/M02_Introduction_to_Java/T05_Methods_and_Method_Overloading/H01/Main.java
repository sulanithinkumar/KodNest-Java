
import java.util.Scanner;

class StudentUtility {

    void showReportTitle() {
        System.out.println("Student Performance Report");
    }

    void displayStudent(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    double getPassingPercentage() {
        double percentage = 60.0;
        return percentage;
    }

    double calculatePercentage(int javaScore, int sqlScore) {
        double percentage = (javaScore + sqlScore) / 2.0;
        return percentage;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentUtility util = new StudentUtility();

        System.out.println("Enter Id: ");
        int id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Java score: ");
        int javaScore = scanner.nextInt();
        System.out.println("Enter SQL score: ");
        int sqlScore = scanner.nextInt();

        util.showReportTitle();
        util.displayStudent(id, name);
        double passingPercentage = util.getPassingPercentage();
        double percentage = util.calculatePercentage(javaScore, sqlScore);
        String result = percentage >= passingPercentage ? "PASS" : "NEEDS IMPROVEMENT";

        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
