
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No of Rows: ");
        int row = scan.nextInt();
        System.out.println("Enter No of Columns: ");
        int col = scan.nextInt();

        int a[][] = new int[row][col];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scan.nextInt();

            }
        }

        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a[i].length; j++) {
                total += a[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);

        }
    }
}
