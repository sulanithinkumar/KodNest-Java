
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
        String res = "";

        for (int i = 0; i <= arr.length - 1; i++) {
            if (target == arr[i]) {
                res = "Found";
                break;
            } else {
                res = "Not Found";
            }
        }

        System.out.println("Result: " + res);

        System.out.print("Reverse order: ");

        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.print(arr[i] + (i == 0 ? "" : " "));
        }
    }
}
