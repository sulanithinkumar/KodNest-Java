
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array size: ");
        int size = scan.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter Array Values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("Enter no of rows of matrix: ");
        int row = scan.nextInt();
        System.out.println("Enter no of columns of matrix: ");
        int cols = scan.nextInt();

        int matrix[][] = new int[row][cols];

        System.out.println("Enter Matrix Values: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        int arrTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            arrTotal += arr[i];
        }
        int matrixTotal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixTotal += matrix[i][j];
            }
        }
        System.out.println("Array total: " + arrTotal);
        System.out.println("Matrix total: " + matrixTotal);
    }
}
