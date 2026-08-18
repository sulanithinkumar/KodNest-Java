
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = scanner.nextInt();
        int[] scores = new int[size];

        System.out.println("Enter array values: ");
        for (int i = 0; i <= scores.length - 1; i++) {

            scores[i] = scanner.nextInt();

        }

        System.out.print("Reverse scores: ");
        for (int i = scores.length - 1; i >= 0; i--) {
            System.out.print(scores[i] + " ");

        }
    }

}
