
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int arr[] = new int[scan.nextInt()];

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println("Enter Array values: ");
            arr[i] = scan.nextInt();

        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i <= arr.length - 1; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

    }

}
