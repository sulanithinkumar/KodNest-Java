
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Practice Days: ");
        int practiceDays = scan.nextInt();
        int totalSolvedProblems = 0;

        for (int i = 1; i <= practiceDays; i++) {

            System.out.println("Enter Problems solved: ");
            int problemsSolved = scan.nextInt();
            totalSolvedProblems += problemsSolved;
        }
        System.out.println("Total solved: " + totalSolvedProblems);

        if (totalSolvedProblems >= 20) {

            System.out.println("Status: Strong progress");

        } else if (totalSolvedProblems >= 10 && totalSolvedProblems <= 19) {

            System.out.println("Status: Keep improving");

        } else {
            System.out.println("Status: Needs more practice");
        }

    }
}
