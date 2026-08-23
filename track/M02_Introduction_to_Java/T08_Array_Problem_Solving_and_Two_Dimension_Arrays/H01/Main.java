
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter No of Rows: ");
        int row = scan.nextInt();
        System.out.println("Enter No of Columns: ");
        int cols = scan.nextInt();

        int seats[][] = new int[row][cols];

        System.out.println("Enter Array Values: ");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                seats[i][j] = scan.nextInt();

            }

        }

        int count = 0;

        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    count += 1;

                }
            }
        }
        System.out.println("Available seats: " + count);

    }
}
