
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Learner Name: ");
        String learnerName = scan.nextLine();

        System.out.println("Enter problems solved: ");
        int problemsSolved = scan.nextInt();

        System.out.println("Enter assessment: ");
        double assessment = scan.nextDouble();

        System.out.println("Learner: " + learnerName);
        System.out.println("Problems solved: " + problemsSolved);
        System.out.println("Assessment: " + assessment);
    }
}
