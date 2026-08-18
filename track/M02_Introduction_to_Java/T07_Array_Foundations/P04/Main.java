
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];
        System.out.println("Enter array values: ");
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = scan.nextInt();
        }
        int total = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            total += arr[i];
        }
        System.out.print("Array values are: ");

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + (i == arr.length ? "" : " "));
        }

        System.out.print("\nTotal: " + total);

    }

}
