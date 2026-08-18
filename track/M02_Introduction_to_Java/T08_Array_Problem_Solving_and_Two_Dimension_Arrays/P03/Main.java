
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

        System.out.println("Enter Target values: ");
        int target = scan.nextInt();
        int count = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == target) {
                count += 1;
            }
        }

        System.out.println("Frequency of " + target + ": " + count);

    }

}
