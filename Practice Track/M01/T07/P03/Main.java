
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no fo days: ");
        int days = scanner.nextInt();
        int[] planned = new int[days];
        int[] completed = new int[days];

        System.out.println("Enter no of Planned: ");
        for (int i = 0; i < planned.length; i++) {
            planned[i] = scanner.nextInt();
        }
        System.out.println("Enter no of Completed: ");
        for (int i = 0; i < completed.length; i++) {
            completed[i] = scanner.nextInt();
        }
        int count = 0;

        for (int i = 0; i < planned.length; i++) {
            if (planned[i] <= completed[i]) {
                System.out.println("Day " + (i + 1) + ": Completed");
                count += 1;
            } else {
                System.out.println("Day " + (i + 1) + ": Pending");

            }

        }

        System.out.println("Completed days: " + count);

    }
}
