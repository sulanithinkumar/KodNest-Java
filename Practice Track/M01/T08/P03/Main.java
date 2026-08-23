
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter no of classes: ");
        int classes = scanner.nextInt();
        System.out.println("Enter no of days: ");
        int days = scanner.nextInt();

        int[][] attendance = new int[classes][days];

        for (int i = 0; i < attendance.length; i++) {

            for (int j = 0; j < attendance[i].length; j++) {
                System.out.println("Enter attendance of Class-" + (i + 1) + ", day-" + (j + 1) + ":");
                attendance[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < days; i++) {

            int total = 0;
            for (int j = 0; j < classes; j++) {
                total += attendance[j][i];
            }
            System.out.println("Day " + (i + 1) + " total: " + total);
        }
    }

}
