
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coding score: ");
        int codingScore = scanner.nextInt();

        System.out.println("Enter attendance: ");
        int attendance = scanner.nextInt();

        System.out.println("Enter no of projects: ");
        int projects = scanner.nextInt();

        if (codingScore >= 60 && (attendance >= 75 || projects >= 2)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");

        }

        scanner.close();

    }

}
