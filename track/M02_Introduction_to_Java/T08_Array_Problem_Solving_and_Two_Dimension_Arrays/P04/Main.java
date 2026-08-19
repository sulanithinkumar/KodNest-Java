
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = scan.nextInt();
        System.out.println("Enter no of colums: ");
        int colums = scan.nextInt();
        int a[][] = new int[rows][colums];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter array values of row " + (i + 1) + ": ");
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();

        }
    }
}
