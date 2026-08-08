
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter learner name: ");
        String learnerName = scanner.nextLine();

        System.out.println("Enter no of practice days: ");
        int practiceDays = scanner.nextInt();

        int totalSolved = 0;

        for (int i = 1; i <= practiceDays; i++) {

            System.out.println("Enter no of problems solved: ");
            int problemsSolved = scanner.nextInt();
            totalSolved += problemsSolved;

        }

        double dailyAverage = totalSolved / practiceDays;

        String status = dailyAverage >= 5.0 ? "Consistent" : "Needs consistency";

        System.out.println("Learner: " + learnerName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);
    }
}
